package com.springboot.app.lombok.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data 
@Component 
@ConfigurationProperties(prefix = "my.app") 
public class EmailService {
	
	private String host;
	private String port;
	private String username;
	private boolean active;
	//CONFIGURATION PROPERTIES WITH COLLECTIONS
	private List<String> states;
	private Set<String> dist;
	//CONFIGURATION PROPERTIES WITH ARRAY AND MAP
	private String[] company;
	private Map<String,String> data;
	//we can use Properties keyword at the place of Map and In Properties we can declare any key-value pair
	private Properties data1;
	//we can use Object Reference
	private Message mob;
	
	

}
