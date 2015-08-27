package org.abframe.service;

import org.abframe.dao.BaseDaoSupport;
import org.abframe.entity.Page;
import org.abframe.util.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("memberUserService")
public class MemberUserService {

    @Resource(name = "daoSupport")
    private BaseDaoSupport dao;


    /*
    * 通过id获取数据
    */
    public PageData findByUiId(PageData pd) throws Exception {
        return (PageData) dao.findForObject("MemberUserMapper.findByUiId", pd);
    }

    /*
    * 通过loginname获取数据
    */
    public PageData findByUId(PageData pd) throws Exception {
        return (PageData) dao.findForObject("MemberUserMapper.findByUId", pd);
    }

    /*
    * 通过邮箱获取数据
    */
    public PageData findByUE(PageData pd) throws Exception {
        return (PageData) dao.findForObject("MemberUserMapper.findByUE", pd);
    }

    /*
    * 通过编号获取数据
    */
    public PageData findByUN(PageData pd) throws Exception {
        return (PageData) dao.findForObject("MemberUserMapper.findByUN", pd);
    }

    /*
    * 保存用户
    */
    public void saveU(PageData pd) throws Exception {
        dao.save("MemberUserMapper.saveU", pd);
    }

    /*
    * 修改用户
    */
    public void editU(PageData pd) throws Exception {
        dao.update("MemberUserMapper.editU", pd);
    }

    /*
    * 删除用户
    */
    public void deleteU(PageData pd) throws Exception {
        dao.delete("MemberUserMapper.deleteU", pd);
    }

    /*
    * 批量删除用户
    */
    public void deleteAllU(String[] USER_IDS) throws Exception {
        dao.delete("MemberUserMapper.deleteAllU", USER_IDS);
    }

    /*
    *用户列表(全部)
    */
    public List<PageData> listAllUser(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("MemberUserMapper.listAllUser", pd);
    }

    /*
    *用户列表(用户组)
    */
    public List<PageData> listPdPageUser(Page page) throws Exception {
        return (List<PageData>) dao.findForList("MemberUserMapper.userlistPage", page);
    }

    /*
    * 保存用户IP
    */
    public void saveIP(PageData pd) throws Exception {
        dao.update("MemberUserMapper.saveIP", pd);
    }

    /*
    * 登录判断
    */
    public PageData getUserByNameAndPwd(PageData pd) throws Exception {
        return (PageData) dao.findForObject("MemberUserMapper.getUserInfo", pd);
    }

    /*
    * 跟新登录时间
    */
    public void updateLastLogin(PageData pd) throws Exception {
        dao.update("MemberUserMapper.updateLastLogin", pd);
    }
    //======================================================================================


}
