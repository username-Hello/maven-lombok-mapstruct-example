package command.mapper;

import command.UserCommand;
import entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

	UserCommand userToUserCommand(User user);

	User userCommandToUser(UserCommand userCommand);
}
