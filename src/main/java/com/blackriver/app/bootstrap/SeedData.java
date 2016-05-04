package com.blackriver.app.bootstrap;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Bipin on 5/3/2016.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    private Logger log = Logger.getLogger(SeedData.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    }

}
