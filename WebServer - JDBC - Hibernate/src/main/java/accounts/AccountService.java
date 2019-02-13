package accounts;

import dbService.DBException;
import dbService.DBServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private final Map<String, UserProfile> loginToProfile;
    private final Map<String, UserProfile> sessionIdToProfile;
    private DBServiceImpl dbService;

    public AccountService(DBServiceImpl dbService) {
        loginToProfile = new HashMap<>();
        sessionIdToProfile = new HashMap<>();
        this.dbService = dbService;
    }

    public void addNewUser(UserProfile userProfile) throws DBException {
        loginToProfile.put(userProfile.getName(), userProfile);
        dbService.addUser(userProfile.getName(), userProfile.getPassword());
    }

    public UserProfile getUserByLogin(String login) {
        return loginToProfile.get(login);
    }

    public UserProfile getUserBySessionId(String sessionId) {
        return sessionIdToProfile.get(sessionId);
    }

    public void addSession(String sessionId, UserProfile userProfile) {
        sessionIdToProfile.put(sessionId, userProfile);
    }

    public void deleteSession(String sessionId) {
        sessionIdToProfile.remove(sessionId);
    }
}
