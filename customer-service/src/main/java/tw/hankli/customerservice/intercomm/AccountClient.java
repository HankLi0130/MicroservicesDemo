package tw.hankli.customerservice.intercomm;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tw.hankli.customerservice.model.Account;

import java.util.List;

@FeignClient("account-service")
public interface AccountClient {

    @GetMapping(value = "/accounts/customer/{customerId}")
    List<Account> getAccounts(@PathVariable("customerId") Integer customerId);
}
