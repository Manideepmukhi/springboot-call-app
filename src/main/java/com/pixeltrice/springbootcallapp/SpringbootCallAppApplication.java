package com.pixeltrice.springbootcallapp;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringbootCallAppApplication implements ApplicationRunner{
	
	private final static String SID_ACCOUNT = "ACb059e1c319a476dc1e6467869b459188";
			private final static String AUTH_ID = "c423c93ee75a4f66ec1a2eb783bba68e";
			private final static String FROM_NUMBER="+12512205920";
			private final static String TO_NUMBER ="+918228807687";
			
			static {
				   Twilio.init("ACb059e1c319a476dc1e6467869b459188","c423c93ee75a4f66ec1a2eb783bba68e");
				}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCallAppApplication.class, args);
		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Call.creator(new PhoneNumber("+918228807687"), new PhoneNumber("+12512205920"),
				   new URI("http://demo.twilio.com/docs/voice.xml")).create();
		
	}

}
