package ru.vyarus.dropwizard.guice.cases.hkscope.support

import javax.ws.rs.container.ContainerRequestContext
import javax.ws.rs.container.ContainerResponseContext
import javax.ws.rs.container.ContainerResponseFilter
import javax.ws.rs.ext.Provider

/**
 * @author Vyacheslav Rusakov
 * @since 19.01.2016
 */
@Provider
class GuiceContainerResponseFilter implements ContainerResponseFilter {

    @Override
    void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {

    }
}
