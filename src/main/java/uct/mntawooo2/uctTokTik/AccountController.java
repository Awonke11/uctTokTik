package uct.mntawooo2.uctTokTik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping()
    public ResponseEntity<List<Account>> getAccounts() {
        return new ResponseEntity<>(accountService.allAccounts(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        return new ResponseEntity<>(accountService.addAccount(account), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAccount(@RequestBody String id) {
        Integer accountId = Integer.parseInt(id);
        return new ResponseEntity<>(accountService.deleteAccount(accountId), HttpStatus.ACCEPTED);
    }

    @PutMapping("/follow")
    public ResponseEntity<String> addFollow(@RequestBody String id) {
        Integer accountId = Integer.parseInt(id);
        return new ResponseEntity<>(accountService.addFollower(accountId), HttpStatus.OK);
    }

    @PutMapping("/unfollow")
    public ResponseEntity<String> removeFollow(@RequestBody String id) {
        Integer accountId = Integer.parseInt(id);
        return new ResponseEntity<>(accountService.removeFollower(accountId), HttpStatus.OK);
    }
}
