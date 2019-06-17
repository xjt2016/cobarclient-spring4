package io.gitee.xjt2016;


public class HashFunction {

    /**
     * 0标识1库，1标识2库
     *
     * @param fkId
     * @return
     */

    public Long apply(Long fkId) {
//		logger.debug("fk router input = " + fkId);
        if (fkId == null) {
            return 1L;
        } else if (fkId.longValue() == 1L) {
            return 1L;
        } else if (fkId.longValue() == 2L) {
            return 2L;
        } else {
            return 1L;
        }
    }

}
