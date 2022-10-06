package com.project.smartcab_api;

@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
@RollBack(false)

public class UserRepositoryTests {
@Autowired
private TestEntityManager entityManager;

@Autowired
private UserRepository repo;
}
