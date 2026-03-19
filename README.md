# 🏆 The Challenges
## Challenge 4: Bean Lifecycle Watcher
- Goal: Observe the "Birth" and "Death" of a Spring Bean.

- Task: Use @PostConstruct and @PreDestroy to log messages during bean initialization and shutdown.

- Key Concept: Understanding when dependencies are fully injected vs. when the constructor is called.

## Challenge 5: Manual Bean Definition
- Goal: Define beans for 3rd party libraries that lack Spring annotations.

- Task: Create a ProjectConfig class with @Configuration and use the @Bean annotation to manually instantiate a CustomFeature object.

- Key Concept: Moving away from @Component for explicit control.

## Challenge 6: The "Hide and Seek" Scan
- Goal: Connect components located in external packages.

- Task: Create a HiddenService in a package outside the main application scan. Use scanBasePackages or a separate @ComponentScan config to find it.

- Key Concept: Modularizing large-scale applications.

## Challenge 7: The 3-Tier Flow
- Goal: Build a professional data flow: Controller → Service → Repository.

- Task: Create a UserEntity (with password) and a UserDTO (without password). Fetch data from the Repository and map it manually in the Service.

- Key Concept: Decoupling database logic from the API layer for security.

## Challenge 8: Auto-Magic Mapping (ModelMapper)
- Goal: Stop writing manual setter methods for DTOs.

- Task: Integrate ModelMapper into the Service layer to automatically convert Entities to DTOs in a single line of code.

- Key Concept: Reducing boilerplate code and increasing development speed.

## Challenge 9: The "Flat" Challenge (Nested Objects)
- Goal: Map complex nested objects automatically.

- Task: Add an AddressEntity inside UserEntity. Configure ModelMapper to map address.city into a flat addressCity field in UserDTO.

- Key Concept: Intelligent mapping strategies.

## Challenge 10: Custom Rules (TypeMap)
- Goal: Map fields that have completely different names.

- Task: Map UserEntity.secretIdentity to UserDTO.publicName using ModelMapper's TypeMap configuration.

- Key Concept: Overriding default mapping behavior with custom rules.