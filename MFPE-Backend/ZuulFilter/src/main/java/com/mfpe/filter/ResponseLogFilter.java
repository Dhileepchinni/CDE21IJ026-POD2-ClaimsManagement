package com.mfpe.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;


public class ResponseLogFilter extends ZuulFilter {
    
	
	private static final Logger log = LoggerFactory.getLogger(ResponseLogFilter.class);

	
    @Override
    public String filterType() {
    log.info("ResponseLogFilter.filterType()");
        return "pre";
    }

    @Override
    public int filterOrder() {
    	log.info("ResponseLogFilter.filterOrder()");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
    	log.info("ResponseLogFilter.shouldFilter()");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
