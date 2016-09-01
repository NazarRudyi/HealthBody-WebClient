
package edu.softserveinc.healthbody.webclient.healthbody.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HealthBodyService", targetNamespace = "http://webservice.healthbody.softserveinc.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HealthBodyService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.UserDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUsersinCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllUsersinCompetition")
    @ResponseWrapper(localName = "getAllUsersinCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllUsersinCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllUsersinCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllUsersinCompetitionResponse")
    public List<UserDTO> getAllUsersinCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns edu.softserveinc.healthbody.webclient.healthbody.webservice.UserDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserByLogin", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetUserByLogin")
    @ResponseWrapper(localName = "getUserByLoginResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetUserByLoginResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getUserByLoginRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getUserByLoginResponse")
    public UserDTO getUserByLogin(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns edu.softserveinc.healthbody.webclient.healthbody.webservice.GroupDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGroupByName", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetGroupByName")
    @ResponseWrapper(localName = "getGroupByNameResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetGroupByNameResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getGroupByNameRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getGroupByNameResponse")
    public GroupDTO getGroupByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns edu.softserveinc.healthbody.webclient.healthbody.webservice.GroupDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGroupById", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetGroupById")
    @ResponseWrapper(localName = "getGroupByIdResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetGroupByIdResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getGroupByIdRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getGroupByIdResponse")
    public GroupDTO getGroupById(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDescriptionOfGroup", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetDescriptionOfGroup")
    @ResponseWrapper(localName = "getDescriptionOfGroupResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetDescriptionOfGroupResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getDescriptionOfGroupRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getDescriptionOfGroupResponse")
    public String getDescriptionOfGroup(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateGroup", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.UpdateGroup")
    @ResponseWrapper(localName = "updateGroupResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.UpdateGroupResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/updateGroupRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/updateGroupResponse")
    public void updateGroup(
        @WebParam(name = "arg0", targetNamespace = "")
        GroupDTO arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCompetitions", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllCompetitions")
    @ResponseWrapper(localName = "getAllCompetitionsResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllCompetitionsResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllCompetitionsRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllCompetitionsResponse")
    public List<CompetitionDTO> getAllCompetitions(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.UpdateUserResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/updateUserRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/updateUserResponse")
    public void updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserDTO arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllActiveCompetitions", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllActiveCompetitions")
    @ResponseWrapper(localName = "getAllActiveCompetitionsResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllActiveCompetitionsResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllActiveCompetitionsRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllActiveCompetitionsResponse")
    public List<CompetitionDTO> getAllActiveCompetitions(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCompetitionsByUser", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllCompetitionsByUser")
    @ResponseWrapper(localName = "getAllCompetitionsByUserResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllCompetitionsByUserResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllCompetitionsByUserRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllCompetitionsByUserResponse")
    public List<CompetitionDTO> getAllCompetitionsByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllActiveCompetitionsByUser", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllActiveCompetitionsByUser")
    @ResponseWrapper(localName = "getAllActiveCompetitionsByUserResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllActiveCompetitionsByUserResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllActiveCompetitionsByUserRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllActiveCompetitionsByUserResponse")
    public List<CompetitionDTO> getAllActiveCompetitionsByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.CreateCompetition")
    @ResponseWrapper(localName = "createCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.CreateCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/createCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/createCompetitionResponse")
    public void createCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        CompetitionDTO arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUserInCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.AddUserInCompetition")
    @ResponseWrapper(localName = "addUserInCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.AddUserInCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/addUserInCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/addUserInCompetitionResponse")
    public boolean addUserInCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUserInCompetitionView", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.AddUserInCompetitionView")
    @ResponseWrapper(localName = "addUserInCompetitionViewResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.AddUserInCompetitionViewResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/addUserInCompetitionViewRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/addUserInCompetitionViewResponse")
    public boolean addUserInCompetitionView(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeUserFromCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.RemoveUserFromCompetition")
    @ResponseWrapper(localName = "removeUserFromCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.RemoveUserFromCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/removeUserFromCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/removeUserFromCompetitionResponse")
    public boolean removeUserFromCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "lockUser", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.LockUser")
    @ResponseWrapper(localName = "lockUserResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.LockUserResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/lockUserRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/lockUserResponse")
    public void lockUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.UserDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllUsers")
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllUsersResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllUsersRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllUsersResponse")
    public List<UserDTO> getAllUsers(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.UserDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUserstoAddInCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllUserstoAddInCompetition")
    @ResponseWrapper(localName = "getAllUserstoAddInCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllUserstoAddInCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllUserstoAddInCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllUserstoAddInCompetitionResponse")
    public List<UserDTO> getAllUserstoAddInCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.GroupDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllGroups", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllGroups")
    @ResponseWrapper(localName = "getAllGroupsResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllGroupsResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllGroupsRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllGroupsResponse")
    public List<GroupDTO> getAllGroups(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<edu.softserveinc.healthbody.webclient.healthbody.webservice.GroupDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllGroupsParticipants", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllGroupsParticipants")
    @ResponseWrapper(localName = "getAllGroupsParticipantsResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetAllGroupsParticipantsResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllGroupsParticipantsRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getAllGroupsParticipantsResponse")
    public List<GroupDTO> getAllGroupsParticipants(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns edu.softserveinc.healthbody.webclient.healthbody.webservice.UserCompetitionsDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetUserCompetition")
    @ResponseWrapper(localName = "getUserCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetUserCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getUserCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getUserCompetitionResponse")
    public UserCompetitionsDTO getUserCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUserCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.DeleteUserCompetition")
    @ResponseWrapper(localName = "deleteUserCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.DeleteUserCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/deleteUserCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/deleteUserCompetitionResponse")
    public void deleteUserCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUserFromGroup", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.DeleteUserFromGroup")
    @ResponseWrapper(localName = "deleteUserFromGroupResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.DeleteUserFromGroupResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/deleteUserFromGroupRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/deleteUserFromGroupResponse")
    public void deleteUserFromGroup(
        @WebParam(name = "arg0", targetNamespace = "")
        UserDTO arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.UpdateCompetition")
    @ResponseWrapper(localName = "updateCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.UpdateCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/updateCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/updateCompetitionResponse")
    public void updateCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        CompetitionDTO arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompetitionViewByName", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetCompetitionViewByName")
    @ResponseWrapper(localName = "getCompetitionViewByNameResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetCompetitionViewByNameResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getCompetitionViewByNameRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getCompetitionViewByNameResponse")
    public CompetitionDTO getCompetitionViewByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createUser", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.CreateUserResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/createUserRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/createUserResponse")
    public void createUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserDTO arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createGroup", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.CreateGroup")
    @ResponseWrapper(localName = "createGroupResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.CreateGroupResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/createGroupRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/createGroupResponse")
    public void createGroup(
        @WebParam(name = "arg0", targetNamespace = "")
        GroupDTO arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateUserCompetition", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.UpdateUserCompetition")
    @ResponseWrapper(localName = "updateUserCompetitionResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.UpdateUserCompetitionResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/updateUserCompetitionRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/updateUserCompetitionResponse")
    public void updateUserCompetition(
        @WebParam(name = "arg0", targetNamespace = "")
        UserCompetitionsDTO arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompetitionViewById", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetCompetitionViewById")
    @ResponseWrapper(localName = "getCompetitionViewByIdResponse", targetNamespace = "http://webservice.healthbody.softserveinc.edu/", className = "edu.softserveinc.healthbody.webclient.healthbody.webservice.GetCompetitionViewByIdResponse")
    @Action(input = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getCompetitionViewByIdRequest", output = "http://webservice.healthbody.softserveinc.edu/HealthBodyService/getCompetitionViewByIdResponse")
    public CompetitionDTO getCompetitionViewById(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
