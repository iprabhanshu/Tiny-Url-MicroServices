package com.prabhanshu.tinyurl.service;

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

    public String getUrlFromShortUrl(String shortUrl) {
        try {
            TinyURL foundUrl = tinyURLRepository.getOne(TinyURLUtils.shortURLtoID(shortUrl));
            foundUrl.setCount(foundUrl.getCount() + 1);
            tinyURLRepository.save(foundUrl);
            return "redirect:" + foundUrl.getURL();
        } catch (Exception e) {
            return "redirect:https://google.com";
        }
    }
}
