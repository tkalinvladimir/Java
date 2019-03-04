package tutorial.services;

import org.springframework.stereotype.Service;

@Service("dummyService")
public class DummyServiceImpl implements DummyService {

    public String test() {
        return "OK";
    }
}
