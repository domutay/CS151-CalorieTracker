package com.cs151.calorieTracker.repository;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.cs151.calorieTracker.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class  UserRepository {

    @Autowired
    private static DynamoDBMapper dynamoDBMapper;

    public static User save(User user){
        dynamoDBMapper.save(user);
        return user;
    }

    public User findById(String id){
        return dynamoDBMapper.load(User.class, id);
    }

    public List<User> findAll(){
        return dynamoDBMapper.scan(User.class, new DynamoDBScanExpression());
    }

    public String update(String id, User user){
        dynamoDBMapper.save(user, new DynamoDBSaveExpression().withExpectedEntry("id", new ExpectedAttributeValue(new AttributeValue().withS(id))));
        return id;
    }

    public String delete(String id){
        User user = dynamoDBMapper.load(User.class, id);
        dynamoDBMapper.delete(user);
        return "User Deleted Successfully: " + id;
    }

}
