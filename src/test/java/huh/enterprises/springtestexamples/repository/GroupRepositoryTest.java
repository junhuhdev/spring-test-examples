package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.annotation.DataTest;
import huh.enterprises.springtestexamples.domain.RewardGroup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@DataTest
class GroupRepositoryTest {

	@Autowired
	private RewardGroupRepository groupRepository;


	@DisplayName("Create Group and verify")
	@Test
	public void create_group() {
		var group = RewardGroup.builder()
				.ssn("19910102-1234")
				.build();
		groupRepository.save(group);
		var groups = groupRepository.findAll();
		assertThat(groups).containsExactly(group);
	}


}