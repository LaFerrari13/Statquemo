package com.ashuraprojs.statquemo.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Student {
	@NonNull
	private int id;
	@NonNull
	private String name;
	@NonNull
	private int marks;
}
