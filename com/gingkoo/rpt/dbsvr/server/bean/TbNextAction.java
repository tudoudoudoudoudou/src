package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbNextAction extends TbNextActionKey {
    private String flowId;

    private String dataStatus;

    private String nextAction;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String nextOrgId;

    private String nextOper;

    private String isEnd;

    private String dataBakFlag;

    private String sysId;

    private static final long serialVersionUID = 1L;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public String getNextAction() {
        return nextAction;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction == null ? null : nextAction.trim();
    }

    public String getRsv1() {
        return rsv1;
    }

    public void setRsv1(String rsv1) {
        this.rsv1 = rsv1 == null ? null : rsv1.trim();
    }

    public String getRsv2() {
        return rsv2;
    }

    public void setRsv2(String rsv2) {
        this.rsv2 = rsv2 == null ? null : rsv2.trim();
    }

    public String getRsv3() {
        return rsv3;
    }

    public void setRsv3(String rsv3) {
        this.rsv3 = rsv3 == null ? null : rsv3.trim();
    }

    public String getRsv4() {
        return rsv4;
    }

    public void setRsv4(String rsv4) {
        this.rsv4 = rsv4 == null ? null : rsv4.trim();
    }

    public String getRsv5() {
        return rsv5;
    }

    public void setRsv5(String rsv5) {
        this.rsv5 = rsv5 == null ? null : rsv5.trim();
    }

    public String getNextOrgId() {
        return nextOrgId;
    }

    public void setNextOrgId(String nextOrgId) {
        this.nextOrgId = nextOrgId == null ? null : nextOrgId.trim();
    }

    public String getNextOper() {
        return nextOper;
    }

    public void setNextOper(String nextOper) {
        this.nextOper = nextOper == null ? null : nextOper.trim();
    }

    public String getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(String isEnd) {
        this.isEnd = isEnd == null ? null : isEnd.trim();
    }

    public String getDataBakFlag() {
        return dataBakFlag;
    }

    public void setDataBakFlag(String dataBakFlag) {
        this.dataBakFlag = dataBakFlag == null ? null : dataBakFlag.trim();
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case CORP_ID: {
            return getCorpId();
        }
        case ACTION_ID: {
            return getActionId();
        }
        case CONDITION_ID: {
            return getConditionId();
        }
        case CURR_DATA_STATUS: {
            return getCurrDataStatus();
        }
        case FLOW_ID: {
            return getFlowId();
        }
        case DATA_STATUS: {
            return getDataStatus();
        }
        case NEXT_ACTION: {
            return getNextAction();
        }
        case RSV1: {
            return getRsv1();
        }
        case RSV2: {
            return getRsv2();
        }
        case RSV3: {
            return getRsv3();
        }
        case RSV4: {
            return getRsv4();
        }
        case RSV5: {
            return getRsv5();
        }
        case NEXT_ORG_ID: {
            return getNextOrgId();
        }
        case NEXT_OPER: {
            return getNextOper();
        }
        case IS_END: {
            return getIsEnd();
        }
        case DATA_BAK_FLAG: {
            return getDataBakFlag();
        }
        case SYS_ID: {
            return getSysId();
        }
        default: {
            return null;
        }}
    }

    @Override
    public String get(String column) {
        return get(Column.parse(column));
    }

    @Override
    public Map<String, String> get(Map<String, String> map) {
        for (Column c: Column.values()) {
            map.put(c.toString(), get(c));
        }
        return map;
    }

    public TbNextAction set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case ACTION_ID: {
            setActionId(value);
            break;
        }
        case CONDITION_ID: {
            setConditionId(value);
            break;
        }
        case CURR_DATA_STATUS: {
            setCurrDataStatus(value);
            break;
        }
        case FLOW_ID: {
            setFlowId(value);
            break;
        }
        case DATA_STATUS: {
            setDataStatus(value);
            break;
        }
        case NEXT_ACTION: {
            setNextAction(value);
            break;
        }
        case RSV1: {
            setRsv1(value);
            break;
        }
        case RSV2: {
            setRsv2(value);
            break;
        }
        case RSV3: {
            setRsv3(value);
            break;
        }
        case RSV4: {
            setRsv4(value);
            break;
        }
        case RSV5: {
            setRsv5(value);
            break;
        }
        case NEXT_ORG_ID: {
            setNextOrgId(value);
            break;
        }
        case NEXT_OPER: {
            setNextOper(value);
            break;
        }
        case IS_END: {
            setIsEnd(value);
            break;
        }
        case DATA_BAK_FLAG: {
            setDataBakFlag(value);
            break;
        }
        case SYS_ID: {
            setSysId(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbNextAction set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbNextAction set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbNextAction set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getActionId() != null) {
            builder.append("actionId", getActionId());
        }
        if (getConditionId() != null) {
            builder.append("conditionId", getConditionId());
        }
        if (getCurrDataStatus() != null) {
            builder.append("currDataStatus", getCurrDataStatus());
        }
        if (getFlowId() != null) {
            builder.append("flowId", getFlowId());
        }
        if (getDataStatus() != null) {
            builder.append("dataStatus", getDataStatus());
        }
        if (getNextAction() != null) {
            builder.append("nextAction", getNextAction());
        }
        if (getRsv1() != null) {
            builder.append("rsv1", getRsv1());
        }
        if (getRsv2() != null) {
            builder.append("rsv2", getRsv2());
        }
        if (getRsv3() != null) {
            builder.append("rsv3", getRsv3());
        }
        if (getRsv4() != null) {
            builder.append("rsv4", getRsv4());
        }
        if (getRsv5() != null) {
            builder.append("rsv5", getRsv5());
        }
        if (getNextOrgId() != null) {
            builder.append("nextOrgId", getNextOrgId());
        }
        if (getNextOper() != null) {
            builder.append("nextOper", getNextOper());
        }
        if (getIsEnd() != null) {
            builder.append("isEnd", getIsEnd());
        }
        if (getDataBakFlag() != null) {
            builder.append("dataBakFlag", getDataBakFlag());
        }
        if (getSysId() != null) {
            builder.append("sysId", getSysId());
        }
        return builder.toString();
    }

    public TbNextAction() {
        /* pass */
    }

    public TbNextAction(Map<String, ?> map) {
        set(map);
    }

    public TbNextAction(AbstractTable table) {
        set(table);
    }

    public enum Column {
        CORP_ID,
        ACTION_ID,
        CONDITION_ID,
        CURR_DATA_STATUS,
        FLOW_ID,
        DATA_STATUS,
        NEXT_ACTION,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        NEXT_ORG_ID,
        NEXT_OPER,
        IS_END,
        DATA_BAK_FLAG,
        SYS_ID;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
