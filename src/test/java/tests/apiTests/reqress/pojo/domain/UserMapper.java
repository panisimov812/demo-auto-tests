package tests.apiTests.reqress.pojo.domain;

import tests.apiTests.reqress.pojo.remote.UserRemote;

public class UserMapper {

    public static User map(UserRemote remote) {
        Profile profile = new Profile();
        profile.firstName = remote.firstName;
        profile.lastName = remote.lastName;
        profile.avatar = remote.avatar;

        Contact contact = new Contact();
        contact.email = remote.email;

        User user = new User();
        user.profile = profile;
        user.contact = contact;

        return user;
    }
}
