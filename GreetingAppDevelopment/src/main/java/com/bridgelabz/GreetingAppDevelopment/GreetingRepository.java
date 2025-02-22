package com.bridgelabz.GreetingAppDevelopment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingMessage, Long> {
}



//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface GreetingRepository extends JpaRepository<GreetingMessage, Long> {
//}
