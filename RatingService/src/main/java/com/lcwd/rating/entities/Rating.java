package com.lcwd.rating.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "user_ratings")
public class Rating {
   
	@Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;
}
