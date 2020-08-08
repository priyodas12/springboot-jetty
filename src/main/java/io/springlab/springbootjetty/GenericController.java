package io.springlab.springbootjetty;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class GenericController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity sendViaResponseEntity() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
