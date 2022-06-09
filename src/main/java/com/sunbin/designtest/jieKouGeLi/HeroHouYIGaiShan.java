package com.sunbin.designtest.jieKouGeLi;

public class HeroHouYIGaiShan implements ISkillArchery, ISkillInvisiable, ISkillSilent{
    @Override
    public void doArchery() {
        System.out.println("后裔射箭");
    }

    @Override
    public void doInvisiable() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }

}
