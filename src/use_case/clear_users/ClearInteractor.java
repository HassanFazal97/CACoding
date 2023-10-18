package use_case.clear_users;


import entity.User;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;

import java.util.Map;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary userPresenter){
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    public void execute(ClearInputData inputData){
        Map<String, User> outputData = userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(outputData);
        userPresenter.prepareSuccessView(clearOutputData);
    }

}
