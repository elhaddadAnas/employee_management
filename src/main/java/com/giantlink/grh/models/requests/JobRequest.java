package com.giantlink.grh.models.requests;

import javax.validation.constraints.NotNull;

import com.giantlink.grh.entities.Project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobRequest {

	@NotNull
	private Project project;
	
}
