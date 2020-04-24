package com.prabhanshu.tinyurl.service;

import com.prabhanshu.tinyurl.model.ShortUrl;
import com.prabhanshu.tinyurl.model.TinyURL;
import com.prabhanshu.tinyurl.repository.TinyURLRepository;
import com.prabhanshu.tinyurl.utils.TinyURLUtils;
import org.springframework.stereotype.Service;


@Service
public class TinyURLService {
    final TinyURLRepository tinyURLRepository;

    public TinyURLService(TinyURLRepository tinyURLRepository) {
        this.tinyURLRepository = tinyURLRepository;
    }

    public ShortUrl createShortUrl(String url) {
        TinyURL savedObject = tinyURLRepository.save(new TinyURL(url));
        return new ShortUrl(TinyURLUtils.idToShortURL(savedObject.getId()));
    }
}
