package huh.enterprises.springtestexamples.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Payment {
	// @formatter:off

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	// @formatter:on
}
