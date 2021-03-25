package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.annotation.DataTest;
import huh.enterprises.springtestexamples.domain.Group;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataTest
class GroupRepositoryTest {

	@Autowired
	private GroupRepository groupRepository;


	@Test
	public void test() {
		var group = Group.builder()
				.ssn("19910102-1234")
				.build();
		groupRepository.save(group);
		var groups = groupRepository.findAll();
		assertThat(groups).containsExactly(group);
	}
}