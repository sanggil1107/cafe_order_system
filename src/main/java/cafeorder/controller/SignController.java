package cafeorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cafeorder.entity.User;
import cafeorder.service.SignService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/sign")
public class SignController {

    @Autowired
    private SignService signService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void UserSingup(@RequestBody User user) throws Exception {
        signService.insertUser(user);
    } 

    // @RequestMapping(value = "/signin", method = RequestMethod.POST)
    // public String UserSignin(@RequestBody User user) throws Exception {
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String UserSignin(@RequestParam("userId") String userId, @RequestParam("pwd") String pwd) throws Exception {
        User user = new User();
        user.setUserId(userId);
        user.setPwd(pwd);
        String result = signService.selectUser(user);
        
        return result;
    }

    @RequestMapping(value = "/checkid", method = RequestMethod.GET)
    public Boolean CheckId(@RequestParam("userid") String userId) throws Exception {
        return signService.selectUserId(userId);
    }
}
