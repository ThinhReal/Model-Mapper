# 🏆 The Challenges
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