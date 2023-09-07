package com.rest;

import javax.persistence.*;

@Entity
public class CallQuality {
	
	@Id
    @GeneratedValue
    private Long callid;
    
    private String caller;
    private String receiver;
    private double dropoutRate;
    private String qualityFeedback;
    
    

}
