package com.smarterwith.notification.dto;


import com.smarterwith.notification.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class UserDto {
    @ApiModelProperty(accessMode = ApiModelProperty.AccessMode.READ_ONLY, hidden = true)
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public static User toDomainObject(UserDto dto) {
        return new User(dto.getId(), dto.getFirstName(), dto.getLastName(), dto.getEmail());
    }

    public static UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
    }
}
