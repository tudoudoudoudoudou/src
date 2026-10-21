package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PmVatActRule extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String boucMonth;

    private String txCode;

    private String d1Act;

    private String d1ActRule;

    private BigDecimal d1Amt;

    private String d1AmtRule;

    private String d1AmtSrc;

    private String d2Act;

    private String d2ActRule;

    private BigDecimal d2Amt;

    private String d2AmtRule;

    private String d2AmtSrc;

    private String d3Act;

    private String d3ActRule;

    private BigDecimal d3Amt;

    private String d3AmtRule;

    private String d3AmtSrc;

    private String d4Act;

    private String d4ActRule;

    private BigDecimal d4Amt;

    private String d4AmtRule;

    private String d4AmtSrc;

    private String c1Act;

    private String c1ActRule;

    private BigDecimal c1Amt;

    private String c1AmtRule;

    private String c1AmtSrc;

    private String c2Act;

    private String c2ActRule;

    private BigDecimal c2Amt;

    private String c2AmtRule;

    private String c2AmtSrc;

    private String c3Act;

    private String c3ActRule;

    private BigDecimal c3Amt;

    private String c3AmtRule;

    private String c3AmtSrc;

    private String c4Act;

    private String c4ActRule;

    private BigDecimal c4Amt;

    private String c4AmtRule;

    private String c4AmtSrc;

    private String remarks;

    private String checkFlag;

    private String checkDesc;

    private String nextAction;

    private String dataStatus;

    private String dataFlag;

    private String dataSource;

    private BigDecimal dataVersion;

    private String dataRejDesc;

    private String dataDelDesc;

    private String dataCrtUser;

    private String dataCrtDate;

    private String dataCrtTime;

    private String dataChgUser;

    private String dataChgDate;

    private String dataChgTime;

    private String dataApvUser;

    private String dataApvDate;

    private String dataApvTime;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String d1CcyRule;

    private String d1Ccy;

    private String d2CcyRule;

    private String d2Ccy;

    private String d3CcyRule;

    private String d3Ccy;

    private String d4CcyRule;

    private String d4Ccy;

    private String c1CcyRule;

    private String c1Ccy;

    private String c2CcyRule;

    private String c2Ccy;

    private String c3CcyRule;

    private String c3Ccy;

    private String c4CcyRule;

    private String c4Ccy;

    private String checkErrType;

    private String actCode;

    private String actType;

    private String actName;

    private static final long serialVersionUID = 1L;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getInqOrgId() {
        return inqOrgId;
    }

    public void setInqOrgId(String inqOrgId) {
        this.inqOrgId = inqOrgId == null ? null : inqOrgId.trim();
    }

    public String getInqGroupId() {
        return inqGroupId;
    }

    public void setInqGroupId(String inqGroupId) {
        this.inqGroupId = inqGroupId == null ? null : inqGroupId.trim();
    }

    public String getBoucMonth() {
        return boucMonth;
    }

    public void setBoucMonth(String boucMonth) {
        this.boucMonth = boucMonth == null ? null : boucMonth.trim();
    }

    public String getTxCode() {
        return txCode;
    }

    public void setTxCode(String txCode) {
        this.txCode = txCode == null ? null : txCode.trim();
    }

    public String getD1Act() {
        return d1Act;
    }

    public void setD1Act(String d1Act) {
        this.d1Act = d1Act == null ? null : d1Act.trim();
    }

    public String getD1ActRule() {
        return d1ActRule;
    }

    public void setD1ActRule(String d1ActRule) {
        this.d1ActRule = d1ActRule == null ? null : d1ActRule.trim();
    }

    public BigDecimal getD1Amt() {
        return d1Amt;
    }

    public void setD1Amt(BigDecimal d1Amt) {
        this.d1Amt = d1Amt;
    }

    public String getD1AmtRule() {
        return d1AmtRule;
    }

    public void setD1AmtRule(String d1AmtRule) {
        this.d1AmtRule = d1AmtRule == null ? null : d1AmtRule.trim();
    }

    public String getD1AmtSrc() {
        return d1AmtSrc;
    }

    public void setD1AmtSrc(String d1AmtSrc) {
        this.d1AmtSrc = d1AmtSrc == null ? null : d1AmtSrc.trim();
    }

    public String getD2Act() {
        return d2Act;
    }

    public void setD2Act(String d2Act) {
        this.d2Act = d2Act == null ? null : d2Act.trim();
    }

    public String getD2ActRule() {
        return d2ActRule;
    }

    public void setD2ActRule(String d2ActRule) {
        this.d2ActRule = d2ActRule == null ? null : d2ActRule.trim();
    }

    public BigDecimal getD2Amt() {
        return d2Amt;
    }

    public void setD2Amt(BigDecimal d2Amt) {
        this.d2Amt = d2Amt;
    }

    public String getD2AmtRule() {
        return d2AmtRule;
    }

    public void setD2AmtRule(String d2AmtRule) {
        this.d2AmtRule = d2AmtRule == null ? null : d2AmtRule.trim();
    }

    public String getD2AmtSrc() {
        return d2AmtSrc;
    }

    public void setD2AmtSrc(String d2AmtSrc) {
        this.d2AmtSrc = d2AmtSrc == null ? null : d2AmtSrc.trim();
    }

    public String getD3Act() {
        return d3Act;
    }

    public void setD3Act(String d3Act) {
        this.d3Act = d3Act == null ? null : d3Act.trim();
    }

    public String getD3ActRule() {
        return d3ActRule;
    }

    public void setD3ActRule(String d3ActRule) {
        this.d3ActRule = d3ActRule == null ? null : d3ActRule.trim();
    }

    public BigDecimal getD3Amt() {
        return d3Amt;
    }

    public void setD3Amt(BigDecimal d3Amt) {
        this.d3Amt = d3Amt;
    }

    public String getD3AmtRule() {
        return d3AmtRule;
    }

    public void setD3AmtRule(String d3AmtRule) {
        this.d3AmtRule = d3AmtRule == null ? null : d3AmtRule.trim();
    }

    public String getD3AmtSrc() {
        return d3AmtSrc;
    }

    public void setD3AmtSrc(String d3AmtSrc) {
        this.d3AmtSrc = d3AmtSrc == null ? null : d3AmtSrc.trim();
    }

    public String getD4Act() {
        return d4Act;
    }

    public void setD4Act(String d4Act) {
        this.d4Act = d4Act == null ? null : d4Act.trim();
    }

    public String getD4ActRule() {
        return d4ActRule;
    }

    public void setD4ActRule(String d4ActRule) {
        this.d4ActRule = d4ActRule == null ? null : d4ActRule.trim();
    }

    public BigDecimal getD4Amt() {
        return d4Amt;
    }

    public void setD4Amt(BigDecimal d4Amt) {
        this.d4Amt = d4Amt;
    }

    public String getD4AmtRule() {
        return d4AmtRule;
    }

    public void setD4AmtRule(String d4AmtRule) {
        this.d4AmtRule = d4AmtRule == null ? null : d4AmtRule.trim();
    }

    public String getD4AmtSrc() {
        return d4AmtSrc;
    }

    public void setD4AmtSrc(String d4AmtSrc) {
        this.d4AmtSrc = d4AmtSrc == null ? null : d4AmtSrc.trim();
    }

    public String getC1Act() {
        return c1Act;
    }

    public void setC1Act(String c1Act) {
        this.c1Act = c1Act == null ? null : c1Act.trim();
    }

    public String getC1ActRule() {
        return c1ActRule;
    }

    public void setC1ActRule(String c1ActRule) {
        this.c1ActRule = c1ActRule == null ? null : c1ActRule.trim();
    }

    public BigDecimal getC1Amt() {
        return c1Amt;
    }

    public void setC1Amt(BigDecimal c1Amt) {
        this.c1Amt = c1Amt;
    }

    public String getC1AmtRule() {
        return c1AmtRule;
    }

    public void setC1AmtRule(String c1AmtRule) {
        this.c1AmtRule = c1AmtRule == null ? null : c1AmtRule.trim();
    }

    public String getC1AmtSrc() {
        return c1AmtSrc;
    }

    public void setC1AmtSrc(String c1AmtSrc) {
        this.c1AmtSrc = c1AmtSrc == null ? null : c1AmtSrc.trim();
    }

    public String getC2Act() {
        return c2Act;
    }

    public void setC2Act(String c2Act) {
        this.c2Act = c2Act == null ? null : c2Act.trim();
    }

    public String getC2ActRule() {
        return c2ActRule;
    }

    public void setC2ActRule(String c2ActRule) {
        this.c2ActRule = c2ActRule == null ? null : c2ActRule.trim();
    }

    public BigDecimal getC2Amt() {
        return c2Amt;
    }

    public void setC2Amt(BigDecimal c2Amt) {
        this.c2Amt = c2Amt;
    }

    public String getC2AmtRule() {
        return c2AmtRule;
    }

    public void setC2AmtRule(String c2AmtRule) {
        this.c2AmtRule = c2AmtRule == null ? null : c2AmtRule.trim();
    }

    public String getC2AmtSrc() {
        return c2AmtSrc;
    }

    public void setC2AmtSrc(String c2AmtSrc) {
        this.c2AmtSrc = c2AmtSrc == null ? null : c2AmtSrc.trim();
    }

    public String getC3Act() {
        return c3Act;
    }

    public void setC3Act(String c3Act) {
        this.c3Act = c3Act == null ? null : c3Act.trim();
    }

    public String getC3ActRule() {
        return c3ActRule;
    }

    public void setC3ActRule(String c3ActRule) {
        this.c3ActRule = c3ActRule == null ? null : c3ActRule.trim();
    }

    public BigDecimal getC3Amt() {
        return c3Amt;
    }

    public void setC3Amt(BigDecimal c3Amt) {
        this.c3Amt = c3Amt;
    }

    public String getC3AmtRule() {
        return c3AmtRule;
    }

    public void setC3AmtRule(String c3AmtRule) {
        this.c3AmtRule = c3AmtRule == null ? null : c3AmtRule.trim();
    }

    public String getC3AmtSrc() {
        return c3AmtSrc;
    }

    public void setC3AmtSrc(String c3AmtSrc) {
        this.c3AmtSrc = c3AmtSrc == null ? null : c3AmtSrc.trim();
    }

    public String getC4Act() {
        return c4Act;
    }

    public void setC4Act(String c4Act) {
        this.c4Act = c4Act == null ? null : c4Act.trim();
    }

    public String getC4ActRule() {
        return c4ActRule;
    }

    public void setC4ActRule(String c4ActRule) {
        this.c4ActRule = c4ActRule == null ? null : c4ActRule.trim();
    }

    public BigDecimal getC4Amt() {
        return c4Amt;
    }

    public void setC4Amt(BigDecimal c4Amt) {
        this.c4Amt = c4Amt;
    }

    public String getC4AmtRule() {
        return c4AmtRule;
    }

    public void setC4AmtRule(String c4AmtRule) {
        this.c4AmtRule = c4AmtRule == null ? null : c4AmtRule.trim();
    }

    public String getC4AmtSrc() {
        return c4AmtSrc;
    }

    public void setC4AmtSrc(String c4AmtSrc) {
        this.c4AmtSrc = c4AmtSrc == null ? null : c4AmtSrc.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getCheckDesc() {
        return checkDesc;
    }

    public void setCheckDesc(String checkDesc) {
        this.checkDesc = checkDesc == null ? null : checkDesc.trim();
    }

    public String getNextAction() {
        return nextAction;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction == null ? null : nextAction.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public BigDecimal getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(BigDecimal dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getDataRejDesc() {
        return dataRejDesc;
    }

    public void setDataRejDesc(String dataRejDesc) {
        this.dataRejDesc = dataRejDesc == null ? null : dataRejDesc.trim();
    }

    public String getDataDelDesc() {
        return dataDelDesc;
    }

    public void setDataDelDesc(String dataDelDesc) {
        this.dataDelDesc = dataDelDesc == null ? null : dataDelDesc.trim();
    }

    public String getDataCrtUser() {
        return dataCrtUser;
    }

    public void setDataCrtUser(String dataCrtUser) {
        this.dataCrtUser = dataCrtUser == null ? null : dataCrtUser.trim();
    }

    public String getDataCrtDate() {
        return dataCrtDate;
    }

    public void setDataCrtDate(String dataCrtDate) {
        this.dataCrtDate = dataCrtDate == null ? null : dataCrtDate.trim();
    }

    public String getDataCrtTime() {
        return dataCrtTime;
    }

    public void setDataCrtTime(String dataCrtTime) {
        this.dataCrtTime = dataCrtTime == null ? null : dataCrtTime.trim();
    }

    public String getDataChgUser() {
        return dataChgUser;
    }

    public void setDataChgUser(String dataChgUser) {
        this.dataChgUser = dataChgUser == null ? null : dataChgUser.trim();
    }

    public String getDataChgDate() {
        return dataChgDate;
    }

    public void setDataChgDate(String dataChgDate) {
        this.dataChgDate = dataChgDate == null ? null : dataChgDate.trim();
    }

    public String getDataChgTime() {
        return dataChgTime;
    }

    public void setDataChgTime(String dataChgTime) {
        this.dataChgTime = dataChgTime == null ? null : dataChgTime.trim();
    }

    public String getDataApvUser() {
        return dataApvUser;
    }

    public void setDataApvUser(String dataApvUser) {
        this.dataApvUser = dataApvUser == null ? null : dataApvUser.trim();
    }

    public String getDataApvDate() {
        return dataApvDate;
    }

    public void setDataApvDate(String dataApvDate) {
        this.dataApvDate = dataApvDate == null ? null : dataApvDate.trim();
    }

    public String getDataApvTime() {
        return dataApvTime;
    }

    public void setDataApvTime(String dataApvTime) {
        this.dataApvTime = dataApvTime == null ? null : dataApvTime.trim();
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

    public String getD1CcyRule() {
        return d1CcyRule;
    }

    public void setD1CcyRule(String d1CcyRule) {
        this.d1CcyRule = d1CcyRule == null ? null : d1CcyRule.trim();
    }

    public String getD1Ccy() {
        return d1Ccy;
    }

    public void setD1Ccy(String d1Ccy) {
        this.d1Ccy = d1Ccy == null ? null : d1Ccy.trim();
    }

    public String getD2CcyRule() {
        return d2CcyRule;
    }

    public void setD2CcyRule(String d2CcyRule) {
        this.d2CcyRule = d2CcyRule == null ? null : d2CcyRule.trim();
    }

    public String getD2Ccy() {
        return d2Ccy;
    }

    public void setD2Ccy(String d2Ccy) {
        this.d2Ccy = d2Ccy == null ? null : d2Ccy.trim();
    }

    public String getD3CcyRule() {
        return d3CcyRule;
    }

    public void setD3CcyRule(String d3CcyRule) {
        this.d3CcyRule = d3CcyRule == null ? null : d3CcyRule.trim();
    }

    public String getD3Ccy() {
        return d3Ccy;
    }

    public void setD3Ccy(String d3Ccy) {
        this.d3Ccy = d3Ccy == null ? null : d3Ccy.trim();
    }

    public String getD4CcyRule() {
        return d4CcyRule;
    }

    public void setD4CcyRule(String d4CcyRule) {
        this.d4CcyRule = d4CcyRule == null ? null : d4CcyRule.trim();
    }

    public String getD4Ccy() {
        return d4Ccy;
    }

    public void setD4Ccy(String d4Ccy) {
        this.d4Ccy = d4Ccy == null ? null : d4Ccy.trim();
    }

    public String getC1CcyRule() {
        return c1CcyRule;
    }

    public void setC1CcyRule(String c1CcyRule) {
        this.c1CcyRule = c1CcyRule == null ? null : c1CcyRule.trim();
    }

    public String getC1Ccy() {
        return c1Ccy;
    }

    public void setC1Ccy(String c1Ccy) {
        this.c1Ccy = c1Ccy == null ? null : c1Ccy.trim();
    }

    public String getC2CcyRule() {
        return c2CcyRule;
    }

    public void setC2CcyRule(String c2CcyRule) {
        this.c2CcyRule = c2CcyRule == null ? null : c2CcyRule.trim();
    }

    public String getC2Ccy() {
        return c2Ccy;
    }

    public void setC2Ccy(String c2Ccy) {
        this.c2Ccy = c2Ccy == null ? null : c2Ccy.trim();
    }

    public String getC3CcyRule() {
        return c3CcyRule;
    }

    public void setC3CcyRule(String c3CcyRule) {
        this.c3CcyRule = c3CcyRule == null ? null : c3CcyRule.trim();
    }

    public String getC3Ccy() {
        return c3Ccy;
    }

    public void setC3Ccy(String c3Ccy) {
        this.c3Ccy = c3Ccy == null ? null : c3Ccy.trim();
    }

    public String getC4CcyRule() {
        return c4CcyRule;
    }

    public void setC4CcyRule(String c4CcyRule) {
        this.c4CcyRule = c4CcyRule == null ? null : c4CcyRule.trim();
    }

    public String getC4Ccy() {
        return c4Ccy;
    }

    public void setC4Ccy(String c4Ccy) {
        this.c4Ccy = c4Ccy == null ? null : c4Ccy.trim();
    }

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode == null ? null : actCode.trim();
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType == null ? null : actType.trim();
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        Object value;
        if (column == null) return null;
        switch (column) {
        case DATA_ID: {
            return getDataId();
        }
        case DATA_DATE: {
            return getDataDate();
        }
        case CORP_ID: {
            return getCorpId();
        }
        case ORG_ID: {
            return getOrgId();
        }
        case GROUP_ID: {
            return getGroupId();
        }
        case INQ_ORG_ID: {
            return getInqOrgId();
        }
        case INQ_GROUP_ID: {
            return getInqGroupId();
        }
        case BOUC_MONTH: {
            return getBoucMonth();
        }
        case TX_CODE: {
            return getTxCode();
        }
        case D_1_ACT: {
            return getD1Act();
        }
        case D_1_ACT_RULE: {
            return getD1ActRule();
        }
        case D_1_AMT: {
            return (value = getD1Amt()) == null ? null : value.toString();
        }
        case D_1_AMT_RULE: {
            return getD1AmtRule();
        }
        case D_1_AMT_SRC: {
            return getD1AmtSrc();
        }
        case D_2_ACT: {
            return getD2Act();
        }
        case D_2_ACT_RULE: {
            return getD2ActRule();
        }
        case D_2_AMT: {
            return (value = getD2Amt()) == null ? null : value.toString();
        }
        case D_2_AMT_RULE: {
            return getD2AmtRule();
        }
        case D_2_AMT_SRC: {
            return getD2AmtSrc();
        }
        case D_3_ACT: {
            return getD3Act();
        }
        case D_3_ACT_RULE: {
            return getD3ActRule();
        }
        case D_3_AMT: {
            return (value = getD3Amt()) == null ? null : value.toString();
        }
        case D_3_AMT_RULE: {
            return getD3AmtRule();
        }
        case D_3_AMT_SRC: {
            return getD3AmtSrc();
        }
        case D_4_ACT: {
            return getD4Act();
        }
        case D_4_ACT_RULE: {
            return getD4ActRule();
        }
        case D_4_AMT: {
            return (value = getD4Amt()) == null ? null : value.toString();
        }
        case D_4_AMT_RULE: {
            return getD4AmtRule();
        }
        case D_4_AMT_SRC: {
            return getD4AmtSrc();
        }
        case C_1_ACT: {
            return getC1Act();
        }
        case C_1_ACT_RULE: {
            return getC1ActRule();
        }
        case C_1_AMT: {
            return (value = getC1Amt()) == null ? null : value.toString();
        }
        case C_1_AMT_RULE: {
            return getC1AmtRule();
        }
        case C_1_AMT_SRC: {
            return getC1AmtSrc();
        }
        case C_2_ACT: {
            return getC2Act();
        }
        case C_2_ACT_RULE: {
            return getC2ActRule();
        }
        case C_2_AMT: {
            return (value = getC2Amt()) == null ? null : value.toString();
        }
        case C_2_AMT_RULE: {
            return getC2AmtRule();
        }
        case C_2_AMT_SRC: {
            return getC2AmtSrc();
        }
        case C_3_ACT: {
            return getC3Act();
        }
        case C_3_ACT_RULE: {
            return getC3ActRule();
        }
        case C_3_AMT: {
            return (value = getC3Amt()) == null ? null : value.toString();
        }
        case C_3_AMT_RULE: {
            return getC3AmtRule();
        }
        case C_3_AMT_SRC: {
            return getC3AmtSrc();
        }
        case C_4_ACT: {
            return getC4Act();
        }
        case C_4_ACT_RULE: {
            return getC4ActRule();
        }
        case C_4_AMT: {
            return (value = getC4Amt()) == null ? null : value.toString();
        }
        case C_4_AMT_RULE: {
            return getC4AmtRule();
        }
        case C_4_AMT_SRC: {
            return getC4AmtSrc();
        }
        case REMARKS: {
            return getRemarks();
        }
        case CHECK_FLAG: {
            return getCheckFlag();
        }
        case CHECK_DESC: {
            return getCheckDesc();
        }
        case NEXT_ACTION: {
            return getNextAction();
        }
        case DATA_STATUS: {
            return getDataStatus();
        }
        case DATA_FLAG: {
            return getDataFlag();
        }
        case DATA_SOURCE: {
            return getDataSource();
        }
        case DATA_VERSION: {
            return (value = getDataVersion()) == null ? null : value.toString();
        }
        case DATA_REJ_DESC: {
            return getDataRejDesc();
        }
        case DATA_DEL_DESC: {
            return getDataDelDesc();
        }
        case DATA_CRT_USER: {
            return getDataCrtUser();
        }
        case DATA_CRT_DATE: {
            return getDataCrtDate();
        }
        case DATA_CRT_TIME: {
            return getDataCrtTime();
        }
        case DATA_CHG_USER: {
            return getDataChgUser();
        }
        case DATA_CHG_DATE: {
            return getDataChgDate();
        }
        case DATA_CHG_TIME: {
            return getDataChgTime();
        }
        case DATA_APV_USER: {
            return getDataApvUser();
        }
        case DATA_APV_DATE: {
            return getDataApvDate();
        }
        case DATA_APV_TIME: {
            return getDataApvTime();
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
        case D_1_CCY_RULE: {
            return getD1CcyRule();
        }
        case D_1_CCY: {
            return getD1Ccy();
        }
        case D_2_CCY_RULE: {
            return getD2CcyRule();
        }
        case D_2_CCY: {
            return getD2Ccy();
        }
        case D_3_CCY_RULE: {
            return getD3CcyRule();
        }
        case D_3_CCY: {
            return getD3Ccy();
        }
        case D_4_CCY_RULE: {
            return getD4CcyRule();
        }
        case D_4_CCY: {
            return getD4Ccy();
        }
        case C_1_CCY_RULE: {
            return getC1CcyRule();
        }
        case C_1_CCY: {
            return getC1Ccy();
        }
        case C_2_CCY_RULE: {
            return getC2CcyRule();
        }
        case C_2_CCY: {
            return getC2Ccy();
        }
        case C_3_CCY_RULE: {
            return getC3CcyRule();
        }
        case C_3_CCY: {
            return getC3Ccy();
        }
        case C_4_CCY_RULE: {
            return getC4CcyRule();
        }
        case C_4_CCY: {
            return getC4Ccy();
        }
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
        }
        case ACT_CODE: {
            return getActCode();
        }
        case ACT_TYPE: {
            return getActType();
        }
        case ACT_NAME: {
            return getActName();
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

    public PmVatActRule set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case DATA_ID: {
            setDataId(value);
            break;
        }
        case DATA_DATE: {
            setDataDate(value);
            break;
        }
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case ORG_ID: {
            setOrgId(value);
            break;
        }
        case GROUP_ID: {
            setGroupId(value);
            break;
        }
        case INQ_ORG_ID: {
            setInqOrgId(value);
            break;
        }
        case INQ_GROUP_ID: {
            setInqGroupId(value);
            break;
        }
        case BOUC_MONTH: {
            setBoucMonth(value);
            break;
        }
        case TX_CODE: {
            setTxCode(value);
            break;
        }
        case D_1_ACT: {
            setD1Act(value);
            break;
        }
        case D_1_ACT_RULE: {
            setD1ActRule(value);
            break;
        }
        case D_1_AMT: {
            value = StringUtils.stripToNull(value);
            setD1Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case D_1_AMT_RULE: {
            setD1AmtRule(value);
            break;
        }
        case D_1_AMT_SRC: {
            setD1AmtSrc(value);
            break;
        }
        case D_2_ACT: {
            setD2Act(value);
            break;
        }
        case D_2_ACT_RULE: {
            setD2ActRule(value);
            break;
        }
        case D_2_AMT: {
            value = StringUtils.stripToNull(value);
            setD2Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case D_2_AMT_RULE: {
            setD2AmtRule(value);
            break;
        }
        case D_2_AMT_SRC: {
            setD2AmtSrc(value);
            break;
        }
        case D_3_ACT: {
            setD3Act(value);
            break;
        }
        case D_3_ACT_RULE: {
            setD3ActRule(value);
            break;
        }
        case D_3_AMT: {
            value = StringUtils.stripToNull(value);
            setD3Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case D_3_AMT_RULE: {
            setD3AmtRule(value);
            break;
        }
        case D_3_AMT_SRC: {
            setD3AmtSrc(value);
            break;
        }
        case D_4_ACT: {
            setD4Act(value);
            break;
        }
        case D_4_ACT_RULE: {
            setD4ActRule(value);
            break;
        }
        case D_4_AMT: {
            value = StringUtils.stripToNull(value);
            setD4Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case D_4_AMT_RULE: {
            setD4AmtRule(value);
            break;
        }
        case D_4_AMT_SRC: {
            setD4AmtSrc(value);
            break;
        }
        case C_1_ACT: {
            setC1Act(value);
            break;
        }
        case C_1_ACT_RULE: {
            setC1ActRule(value);
            break;
        }
        case C_1_AMT: {
            value = StringUtils.stripToNull(value);
            setC1Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case C_1_AMT_RULE: {
            setC1AmtRule(value);
            break;
        }
        case C_1_AMT_SRC: {
            setC1AmtSrc(value);
            break;
        }
        case C_2_ACT: {
            setC2Act(value);
            break;
        }
        case C_2_ACT_RULE: {
            setC2ActRule(value);
            break;
        }
        case C_2_AMT: {
            value = StringUtils.stripToNull(value);
            setC2Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case C_2_AMT_RULE: {
            setC2AmtRule(value);
            break;
        }
        case C_2_AMT_SRC: {
            setC2AmtSrc(value);
            break;
        }
        case C_3_ACT: {
            setC3Act(value);
            break;
        }
        case C_3_ACT_RULE: {
            setC3ActRule(value);
            break;
        }
        case C_3_AMT: {
            value = StringUtils.stripToNull(value);
            setC3Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case C_3_AMT_RULE: {
            setC3AmtRule(value);
            break;
        }
        case C_3_AMT_SRC: {
            setC3AmtSrc(value);
            break;
        }
        case C_4_ACT: {
            setC4Act(value);
            break;
        }
        case C_4_ACT_RULE: {
            setC4ActRule(value);
            break;
        }
        case C_4_AMT: {
            value = StringUtils.stripToNull(value);
            setC4Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case C_4_AMT_RULE: {
            setC4AmtRule(value);
            break;
        }
        case C_4_AMT_SRC: {
            setC4AmtSrc(value);
            break;
        }
        case REMARKS: {
            setRemarks(value);
            break;
        }
        case CHECK_FLAG: {
            setCheckFlag(value);
            break;
        }
        case CHECK_DESC: {
            setCheckDesc(value);
            break;
        }
        case NEXT_ACTION: {
            setNextAction(value);
            break;
        }
        case DATA_STATUS: {
            setDataStatus(value);
            break;
        }
        case DATA_FLAG: {
            setDataFlag(value);
            break;
        }
        case DATA_SOURCE: {
            setDataSource(value);
            break;
        }
        case DATA_VERSION: {
            value = StringUtils.stripToNull(value);
            setDataVersion(value == null ? null : new BigDecimal(value));
            break;
        }
        case DATA_REJ_DESC: {
            setDataRejDesc(value);
            break;
        }
        case DATA_DEL_DESC: {
            setDataDelDesc(value);
            break;
        }
        case DATA_CRT_USER: {
            setDataCrtUser(value);
            break;
        }
        case DATA_CRT_DATE: {
            setDataCrtDate(value);
            break;
        }
        case DATA_CRT_TIME: {
            setDataCrtTime(value);
            break;
        }
        case DATA_CHG_USER: {
            setDataChgUser(value);
            break;
        }
        case DATA_CHG_DATE: {
            setDataChgDate(value);
            break;
        }
        case DATA_CHG_TIME: {
            setDataChgTime(value);
            break;
        }
        case DATA_APV_USER: {
            setDataApvUser(value);
            break;
        }
        case DATA_APV_DATE: {
            setDataApvDate(value);
            break;
        }
        case DATA_APV_TIME: {
            setDataApvTime(value);
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
        case D_1_CCY_RULE: {
            setD1CcyRule(value);
            break;
        }
        case D_1_CCY: {
            setD1Ccy(value);
            break;
        }
        case D_2_CCY_RULE: {
            setD2CcyRule(value);
            break;
        }
        case D_2_CCY: {
            setD2Ccy(value);
            break;
        }
        case D_3_CCY_RULE: {
            setD3CcyRule(value);
            break;
        }
        case D_3_CCY: {
            setD3Ccy(value);
            break;
        }
        case D_4_CCY_RULE: {
            setD4CcyRule(value);
            break;
        }
        case D_4_CCY: {
            setD4Ccy(value);
            break;
        }
        case C_1_CCY_RULE: {
            setC1CcyRule(value);
            break;
        }
        case C_1_CCY: {
            setC1Ccy(value);
            break;
        }
        case C_2_CCY_RULE: {
            setC2CcyRule(value);
            break;
        }
        case C_2_CCY: {
            setC2Ccy(value);
            break;
        }
        case C_3_CCY_RULE: {
            setC3CcyRule(value);
            break;
        }
        case C_3_CCY: {
            setC3Ccy(value);
            break;
        }
        case C_4_CCY_RULE: {
            setC4CcyRule(value);
            break;
        }
        case C_4_CCY: {
            setC4Ccy(value);
            break;
        }
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        case ACT_CODE: {
            setActCode(value);
            break;
        }
        case ACT_TYPE: {
            setActType(value);
            break;
        }
        case ACT_NAME: {
            setActName(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public PmVatActRule set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public PmVatActRule set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public PmVatActRule set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDataId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof PmVatActRule)) {
            return false;
        }
        PmVatActRule rhs = (PmVatActRule) obj;
        return new EqualsBuilder()
                .append(getDataId(), rhs.getDataId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getDataId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getDataId() != null) {
            builder.append("dataId", getDataId());
        }
        if (getDataDate() != null) {
            builder.append("dataDate", getDataDate());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getOrgId() != null) {
            builder.append("orgId", getOrgId());
        }
        if (getGroupId() != null) {
            builder.append("groupId", getGroupId());
        }
        if (getInqOrgId() != null) {
            builder.append("inqOrgId", getInqOrgId());
        }
        if (getInqGroupId() != null) {
            builder.append("inqGroupId", getInqGroupId());
        }
        if (getBoucMonth() != null) {
            builder.append("boucMonth", getBoucMonth());
        }
        if (getTxCode() != null) {
            builder.append("txCode", getTxCode());
        }
        if (getD1Act() != null) {
            builder.append("d1Act", getD1Act());
        }
        if (getD1ActRule() != null) {
            builder.append("d1ActRule", getD1ActRule());
        }
        if (getD1Amt() != null) {
            builder.append("d1Amt", getD1Amt());
        }
        if (getD1AmtRule() != null) {
            builder.append("d1AmtRule", getD1AmtRule());
        }
        if (getD1AmtSrc() != null) {
            builder.append("d1AmtSrc", getD1AmtSrc());
        }
        if (getD2Act() != null) {
            builder.append("d2Act", getD2Act());
        }
        if (getD2ActRule() != null) {
            builder.append("d2ActRule", getD2ActRule());
        }
        if (getD2Amt() != null) {
            builder.append("d2Amt", getD2Amt());
        }
        if (getD2AmtRule() != null) {
            builder.append("d2AmtRule", getD2AmtRule());
        }
        if (getD2AmtSrc() != null) {
            builder.append("d2AmtSrc", getD2AmtSrc());
        }
        if (getD3Act() != null) {
            builder.append("d3Act", getD3Act());
        }
        if (getD3ActRule() != null) {
            builder.append("d3ActRule", getD3ActRule());
        }
        if (getD3Amt() != null) {
            builder.append("d3Amt", getD3Amt());
        }
        if (getD3AmtRule() != null) {
            builder.append("d3AmtRule", getD3AmtRule());
        }
        if (getD3AmtSrc() != null) {
            builder.append("d3AmtSrc", getD3AmtSrc());
        }
        if (getD4Act() != null) {
            builder.append("d4Act", getD4Act());
        }
        if (getD4ActRule() != null) {
            builder.append("d4ActRule", getD4ActRule());
        }
        if (getD4Amt() != null) {
            builder.append("d4Amt", getD4Amt());
        }
        if (getD4AmtRule() != null) {
            builder.append("d4AmtRule", getD4AmtRule());
        }
        if (getD4AmtSrc() != null) {
            builder.append("d4AmtSrc", getD4AmtSrc());
        }
        if (getC1Act() != null) {
            builder.append("c1Act", getC1Act());
        }
        if (getC1ActRule() != null) {
            builder.append("c1ActRule", getC1ActRule());
        }
        if (getC1Amt() != null) {
            builder.append("c1Amt", getC1Amt());
        }
        if (getC1AmtRule() != null) {
            builder.append("c1AmtRule", getC1AmtRule());
        }
        if (getC1AmtSrc() != null) {
            builder.append("c1AmtSrc", getC1AmtSrc());
        }
        if (getC2Act() != null) {
            builder.append("c2Act", getC2Act());
        }
        if (getC2ActRule() != null) {
            builder.append("c2ActRule", getC2ActRule());
        }
        if (getC2Amt() != null) {
            builder.append("c2Amt", getC2Amt());
        }
        if (getC2AmtRule() != null) {
            builder.append("c2AmtRule", getC2AmtRule());
        }
        if (getC2AmtSrc() != null) {
            builder.append("c2AmtSrc", getC2AmtSrc());
        }
        if (getC3Act() != null) {
            builder.append("c3Act", getC3Act());
        }
        if (getC3ActRule() != null) {
            builder.append("c3ActRule", getC3ActRule());
        }
        if (getC3Amt() != null) {
            builder.append("c3Amt", getC3Amt());
        }
        if (getC3AmtRule() != null) {
            builder.append("c3AmtRule", getC3AmtRule());
        }
        if (getC3AmtSrc() != null) {
            builder.append("c3AmtSrc", getC3AmtSrc());
        }
        if (getC4Act() != null) {
            builder.append("c4Act", getC4Act());
        }
        if (getC4ActRule() != null) {
            builder.append("c4ActRule", getC4ActRule());
        }
        if (getC4Amt() != null) {
            builder.append("c4Amt", getC4Amt());
        }
        if (getC4AmtRule() != null) {
            builder.append("c4AmtRule", getC4AmtRule());
        }
        if (getC4AmtSrc() != null) {
            builder.append("c4AmtSrc", getC4AmtSrc());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
        }
        if (getCheckFlag() != null) {
            builder.append("checkFlag", getCheckFlag());
        }
        if (getCheckDesc() != null) {
            builder.append("checkDesc", getCheckDesc());
        }
        if (getNextAction() != null) {
            builder.append("nextAction", getNextAction());
        }
        if (getDataStatus() != null) {
            builder.append("dataStatus", getDataStatus());
        }
        if (getDataFlag() != null) {
            builder.append("dataFlag", getDataFlag());
        }
        if (getDataSource() != null) {
            builder.append("dataSource", getDataSource());
        }
        if (getDataVersion() != null) {
            builder.append("dataVersion", getDataVersion());
        }
        if (getDataRejDesc() != null) {
            builder.append("dataRejDesc", getDataRejDesc());
        }
        if (getDataDelDesc() != null) {
            builder.append("dataDelDesc", getDataDelDesc());
        }
        if (getDataCrtUser() != null) {
            builder.append("dataCrtUser", getDataCrtUser());
        }
        if (getDataCrtDate() != null) {
            builder.append("dataCrtDate", getDataCrtDate());
        }
        if (getDataCrtTime() != null) {
            builder.append("dataCrtTime", getDataCrtTime());
        }
        if (getDataChgUser() != null) {
            builder.append("dataChgUser", getDataChgUser());
        }
        if (getDataChgDate() != null) {
            builder.append("dataChgDate", getDataChgDate());
        }
        if (getDataChgTime() != null) {
            builder.append("dataChgTime", getDataChgTime());
        }
        if (getDataApvUser() != null) {
            builder.append("dataApvUser", getDataApvUser());
        }
        if (getDataApvDate() != null) {
            builder.append("dataApvDate", getDataApvDate());
        }
        if (getDataApvTime() != null) {
            builder.append("dataApvTime", getDataApvTime());
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
        if (getD1CcyRule() != null) {
            builder.append("d1CcyRule", getD1CcyRule());
        }
        if (getD1Ccy() != null) {
            builder.append("d1Ccy", getD1Ccy());
        }
        if (getD2CcyRule() != null) {
            builder.append("d2CcyRule", getD2CcyRule());
        }
        if (getD2Ccy() != null) {
            builder.append("d2Ccy", getD2Ccy());
        }
        if (getD3CcyRule() != null) {
            builder.append("d3CcyRule", getD3CcyRule());
        }
        if (getD3Ccy() != null) {
            builder.append("d3Ccy", getD3Ccy());
        }
        if (getD4CcyRule() != null) {
            builder.append("d4CcyRule", getD4CcyRule());
        }
        if (getD4Ccy() != null) {
            builder.append("d4Ccy", getD4Ccy());
        }
        if (getC1CcyRule() != null) {
            builder.append("c1CcyRule", getC1CcyRule());
        }
        if (getC1Ccy() != null) {
            builder.append("c1Ccy", getC1Ccy());
        }
        if (getC2CcyRule() != null) {
            builder.append("c2CcyRule", getC2CcyRule());
        }
        if (getC2Ccy() != null) {
            builder.append("c2Ccy", getC2Ccy());
        }
        if (getC3CcyRule() != null) {
            builder.append("c3CcyRule", getC3CcyRule());
        }
        if (getC3Ccy() != null) {
            builder.append("c3Ccy", getC3Ccy());
        }
        if (getC4CcyRule() != null) {
            builder.append("c4CcyRule", getC4CcyRule());
        }
        if (getC4Ccy() != null) {
            builder.append("c4Ccy", getC4Ccy());
        }
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        if (getActCode() != null) {
            builder.append("actCode", getActCode());
        }
        if (getActType() != null) {
            builder.append("actType", getActType());
        }
        if (getActName() != null) {
            builder.append("actName", getActName());
        }
        return builder.toString();
    }

    public PmVatActRule() {
        /* pass */
    }

    public PmVatActRule(Map<String, ?> map) {
        set(map);
    }

    public PmVatActRule(AbstractTable table) {
        set(table);
    }

    public enum Column {
        DATA_ID,
        DATA_DATE,
        CORP_ID,
        ORG_ID,
        GROUP_ID,
        INQ_ORG_ID,
        INQ_GROUP_ID,
        BOUC_MONTH,
        TX_CODE,
        D_1_ACT,
        D_1_ACT_RULE,
        D_1_AMT,
        D_1_AMT_RULE,
        D_1_AMT_SRC,
        D_2_ACT,
        D_2_ACT_RULE,
        D_2_AMT,
        D_2_AMT_RULE,
        D_2_AMT_SRC,
        D_3_ACT,
        D_3_ACT_RULE,
        D_3_AMT,
        D_3_AMT_RULE,
        D_3_AMT_SRC,
        D_4_ACT,
        D_4_ACT_RULE,
        D_4_AMT,
        D_4_AMT_RULE,
        D_4_AMT_SRC,
        C_1_ACT,
        C_1_ACT_RULE,
        C_1_AMT,
        C_1_AMT_RULE,
        C_1_AMT_SRC,
        C_2_ACT,
        C_2_ACT_RULE,
        C_2_AMT,
        C_2_AMT_RULE,
        C_2_AMT_SRC,
        C_3_ACT,
        C_3_ACT_RULE,
        C_3_AMT,
        C_3_AMT_RULE,
        C_3_AMT_SRC,
        C_4_ACT,
        C_4_ACT_RULE,
        C_4_AMT,
        C_4_AMT_RULE,
        C_4_AMT_SRC,
        REMARKS,
        CHECK_FLAG,
        CHECK_DESC,
        NEXT_ACTION,
        DATA_STATUS,
        DATA_FLAG,
        DATA_SOURCE,
        DATA_VERSION,
        DATA_REJ_DESC,
        DATA_DEL_DESC,
        DATA_CRT_USER,
        DATA_CRT_DATE,
        DATA_CRT_TIME,
        DATA_CHG_USER,
        DATA_CHG_DATE,
        DATA_CHG_TIME,
        DATA_APV_USER,
        DATA_APV_DATE,
        DATA_APV_TIME,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        D_1_CCY_RULE,
        D_1_CCY,
        D_2_CCY_RULE,
        D_2_CCY,
        D_3_CCY_RULE,
        D_3_CCY,
        D_4_CCY_RULE,
        D_4_CCY,
        C_1_CCY_RULE,
        C_1_CCY,
        C_2_CCY_RULE,
        C_2_CCY,
        C_3_CCY_RULE,
        C_3_CCY,
        C_4_CCY_RULE,
        C_4_CCY,
        CHECK_ERR_TYPE,
        ACT_CODE,
        ACT_TYPE,
        ACT_NAME;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
