package com.mati.items.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "items")
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	@Id
	private String id;
	private String name;
	private BigDecimal price;
	private String description;
	private LocalDate createdDate;
	private LocalDate updatedDate;

}
