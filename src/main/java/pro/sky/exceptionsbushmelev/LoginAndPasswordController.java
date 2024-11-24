package pro.sky.exceptionsbushmelev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginAndPasswordController {
    private final LoginAndPasswordService loginAndPasswordService;

    public LoginAndPasswordController(LoginAndPasswordService loginAndPasswordService) {
        this.loginAndPasswordService = loginAndPasswordService;
    }

    String login = "java_skypro_go";
    String password = "D_1hWiKjjP_9";
    String confirmPassword = password;

    @GetMapping(path = "/")
    public String answerHello() {
        return "привет";
    }

    @GetMapping(path = "/service")
    public String checkLogin(@RequestParam("login") String login,
                             @RequestParam("password") String password,
                             @RequestParam("confirmPassword") String confirmPassword) {
        try {
            loginAndPasswordService.checkParameters(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            return "Неверно введен логин";
        } catch (WrongPasswordException e) {
            return "Неверно введен пароль";
        } finally {
            System.out.println("Проверка окончена");;
        }
        return "Проверка окончена";
    }
}
