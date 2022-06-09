package com.sunbin.designtest.jieKouGeLi;

public class HeroLianPoGaiShan implements ISkillInvisiable, ISkillSilent, ISkillVertigo{

    @Override
    public void doInvisiable() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }
}
