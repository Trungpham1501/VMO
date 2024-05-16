package repository;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT * FROM User ")
    List<User> getUser();

//    @Query(value = "select u.centerid as cenId from User u " +
//            "where (:email is null or u.email = :email)" +
//            " AND (:fName is null or u.fullName like + '%' + SS + '%')"
//            , nativeQuery = true)
//    List<TestDTO> getAllUser(String email, String fname);

    @Query(value = "select u.userid, u.fullName from User u ")
    List<User> getAllUserV2();

    User findByEmail(String email);


    public User findUsersByUserName(String userName);
}
