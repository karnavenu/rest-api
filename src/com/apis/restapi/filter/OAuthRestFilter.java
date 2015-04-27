package com.apis.restapi.filter;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import authserver.beans.OAuthToken;

import com.sun.jersey.core.header.InBoundHeaders;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

/**
 * REST Filter for the the secure REST APIs exposed. Validates the access token
 * in the request for every access to the secured API.
 * 
 * @author Venu Karna
 * 
 */
public class OAuthRestFilter implements ContainerRequestFilter {

	public enum FETCH_BY {
		EMAIL_ID, TOKEN_ID;
	}
	
	@Context
	HttpServletRequest httpServletRequest;

	public OAuthRestFilter() {
	}

	@Override
	public ContainerRequest filter(ContainerRequest request) {
		try {

			String accessToken = request.getHeaderValue("authorization");
			OAuthToken token = validateAccessTokenForUser(accessToken,
					FETCH_BY.TOKEN_ID);

			if (token != null) {
				InBoundHeaders header = new InBoundHeaders();
				header.putSingle("authorization", token.getToken());
				request.setHeaders(header);
			}

		} catch (Exception oAuthException) {
			
		}
		return request;
	}

	public OAuthToken validateAccessTokenForUser(String id, FETCH_BY fetchBy)
			throws Exception {
		OAuthToken token = null;
		
		//do validation
		return token;
	}

}

