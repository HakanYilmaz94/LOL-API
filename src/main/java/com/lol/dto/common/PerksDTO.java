package com.lol.dto.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PerksDTO {
	private long perkStyle;
	private List<Long> perkIds;
	private long perkSubStyle;
}
