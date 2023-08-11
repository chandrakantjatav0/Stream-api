package streammap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
    public static void main(String[] args) {
        List<User> user = new ArrayList<User>();
        user.add(new User(101, "Chandrakant", "secret", "chandrakant@gmail.com"));
        user.add(new User(102, "Vivek", "secret", "vivek@gmail.com"));
        user.add(new User(103, "Aaditya", "secret", "aaditya@gmail.com"));
        user.add(new User(104, "Sushma", "secret", "sushma@gmail.com"));
        List<UserDto> userDtos = new ArrayList<UserDto>();
        for (User users : user) {
            userDtos.add(new UserDto(users.getId(), users.getUsername(), users.getEmail()));
        }
//        for (UserDto dto : userDtos) {
//            System.out.println(dto);
//        }
        //Using StreamAPI
//        user.stream().map(new Function<User,UserDto >() {
//            @Override
//            public UserDto apply(User user) {
//                return new UserDto(user.getId(), user.getUsername(), user.getEmail());
//            }
//        });
//        user.stream().map((User users) ->
//                        new UserDto(users.getId(), users.getUsername(), users.getEmail()))
//                .forEach((userDto) -> System.out.println(userDto));

        user.stream().map((User users) ->
                new UserDto(users.getId(), users.getUsername(), users.getEmail())).collect(Collectors.toList());
        userDtos.forEach(System.out::println);
    }
}

