package Internship;


public class SecondDTODemo {



    public static void main(String[] args) {
        UserRequestDTO dto = new UserRequestDTO("   Karan", "kc@gmail.com",23);
        UserEntity userEntity = mapToEntity(dto);

        System.out.println(userEntity.name);
        System.out.println(userEntity.email);
        System.out.println(userEntity.age);
        System.out.println(userEntity.status);
    }

    private static void validateDto(UserRequestDTO dto) {
        if (dto == null){
            throw new IllegalArgumentException("User request cannot be null");
        }
        if (dto.name == null){
            throw new IllegalArgumentException("Name cannot be null");
        }

        String normalizedName = dto.name.trim();
        if (normalizedName.isEmpty()){
            throw new IllegalArgumentException("Name is required");
        }

        if (dto.email == null){
            throw new IllegalArgumentException("Email cannot be null");
        }

        String normalizedEmail = dto.email.trim();
        if (normalizedEmail.isEmpty()){
            throw new IllegalArgumentException("Email is required");
        }

        if(!normalizedEmail.contains("@")){
            throw new IllegalArgumentException("Invalid email format");
        }

        if(dto.age == null){
            throw new IllegalArgumentException("Age cannot be null");
        }

        if (dto.age < 1 || dto.age > 120){
            throw new IllegalArgumentException("Age must be between 1 and 120");
        }


    }

    private static String determineStatus(Integer age) {
        String status = (age >= 18 )? "ACTIVE" : "INACTIVE";
        return status;
    }

    public static UserEntity mapToEntity(UserRequestDTO dto) {
        validateDto(dto);

        String status = determineStatus(dto.age);

        UserEntity entity = new UserEntity();
        entity.name = dto.name.trim();
        entity.email = dto.email.trim();
        entity.age = dto.age;
        entity.status = status;
        return entity;
    }


}
