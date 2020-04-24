package com.prabhanshu.tinyurl.service;

import com.prabhanshu.tinyurl.model.Stat;
import com.prabhanshu.tinyurl.model.Stats;
import com.prabhanshu.tinyurl.model.TinyURL;
import com.prabhanshu.tinyurl.repository.TinyURLRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class TinyURLService {
    final TinyURLRepository tinyURLRepository;

    public TinyURLService(TinyURLRepository tinyURLRepository) {
        this.tinyURLRepository = tinyURLRepository;
    }

    public Stats getAllStats() {
        ArrayList<Stat> statList = new ArrayList<>();
        for (TinyURL tinyURL : tinyURLRepository.findAll()) {
            statList.add(new Stat(tinyURL.getId(), tinyURL.getCount()));
        }
        return new Stats(statList);
    }
}
