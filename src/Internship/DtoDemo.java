package Internship;

class UserEntity {
    String name;
    String email;
    Integer age;
    String status;
}



public class DtoDemo {
    public static void main(String[] args) {
        UserRequestDTO dto = new UserRequestDTO(" ","kc@gmail.com",25);
        UserEntity entity = mapToEntity(dto);

        System.out.println(entity.name);
        System.out.println(entity.email);
        System.out.println(entity.age);
        System.out.println(entity.status);
    }

    public static UserEntity mapToEntity(UserRequestDTO dto){

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

            if(dto.email == null){
                throw new IllegalArgumentException("Email cannot be null");
            }

            String normalizedEmail = dto.email.trim();
            if(normalizedEmail.isEmpty()){
                throw new IllegalArgumentException("Email is required");
            }

            if(!normalizedEmail.contains("@")){
                throw new IllegalArgumentException("Invalid email format");
            }

            if(dto.age == null){
                throw new IllegalArgumentException("Age cannot be null");
            }

        if (dto.age < 1 || dto.age >= 60) {
            throw new IllegalArgumentException("Age must be between 1 and 120");
        }


        String status = (dto.age >= 18 )? "ACTIVE" : "INACTIVE";



            UserEntity userEntity = new UserEntity();
            userEntity.name = normalizedName;
            userEntity.email = normalizedEmail;
            userEntity.age = dto.age;
            userEntity.status = status;

            return userEntity;


    }


}
