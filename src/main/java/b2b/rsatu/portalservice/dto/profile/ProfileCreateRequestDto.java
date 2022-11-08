package b2b.rsatu.portalservice.dto.profile;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileCreateRequestDto extends ProfileDto {

    private String fullName;

    private LocalDate birthday;

    //todo Переделать на группДто
    private String group;

    //todo переделать на дто для ролей
    private String roles;
}
