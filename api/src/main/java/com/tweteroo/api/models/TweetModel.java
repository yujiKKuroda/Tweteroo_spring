package com.tweteroo.api.models;

import com.tweteroo.api.dtos.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_users")
public class TweetModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private Integer userId;

	@Column(length = 280, nullable = false)
  private String text;

  public TweetModel(TweetDTO dto) {
      this.userId = dto.getUserId();
      this.text = dto.getText();
  }
  
}
