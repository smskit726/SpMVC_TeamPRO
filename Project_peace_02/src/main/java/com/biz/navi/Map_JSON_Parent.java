package com.biz.navi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Map_JSON_Parent {

//	public String code;
//	public String message;
//	public String currentDateTime;
	
	public NcRouter route;
	
}


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class NcRouter {
	
	private NcTrafast[] trafast;
	
}