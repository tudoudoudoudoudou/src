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

public class HisVatTaxEntity extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String orgName;

    private String taxNo;

    private String addr;

    private String tel;

    private String bankNo;

    private String actNo;

    private String payeeName;

    private BigDecimal vocMaxAmt;

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

    private BigDecimal vocAmt;

    private String exchangeType;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String checkErrType;

    private String vocNum;

    private String taxKeySn;

    private String bankName;

    private String machineNo;

    private BigDecimal vocMaxSNum;

    private BigDecimal vocMaxCNum;

    private String identityRuleGroup;

    private String reportCycle;

    private String taxEntType;

    private String reportOrgId;

    private BigDecimal stateRate;

    private String taxMod;

    private BigDecimal vocCAmt;

    private BigDecimal vocMaxCAmt;

    private BigDecimal vocMaxSAmt;

    private BigDecimal vocSAmt;

    private String apvUser;

    private String busiAddr;

    private String corpName;

    private String industryType;

    private String regType;

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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo == null ? null : actNo.trim();
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName == null ? null : payeeName.trim();
    }

    public BigDecimal getVocMaxAmt() {
        return vocMaxAmt;
    }

    public void setVocMaxAmt(BigDecimal vocMaxAmt) {
        this.vocMaxAmt = vocMaxAmt;
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

    public BigDecimal getVocAmt() {
        return vocAmt;
    }

    public void setVocAmt(BigDecimal vocAmt) {
        this.vocAmt = vocAmt;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType == null ? null : exchangeType.trim();
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

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    public String getVocNum() {
        return vocNum;
    }

    public void setVocNum(String vocNum) {
        this.vocNum = vocNum == null ? null : vocNum.trim();
    }

    public String getTaxKeySn() {
        return taxKeySn;
    }

    public void setTaxKeySn(String taxKeySn) {
        this.taxKeySn = taxKeySn == null ? null : taxKeySn.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo == null ? null : machineNo.trim();
    }

    public BigDecimal getVocMaxSNum() {
        return vocMaxSNum;
    }

    public void setVocMaxSNum(BigDecimal vocMaxSNum) {
        this.vocMaxSNum = vocMaxSNum;
    }

    public BigDecimal getVocMaxCNum() {
        return vocMaxCNum;
    }

    public void setVocMaxCNum(BigDecimal vocMaxCNum) {
        this.vocMaxCNum = vocMaxCNum;
    }

    public String getIdentityRuleGroup() {
        return identityRuleGroup;
    }

    public void setIdentityRuleGroup(String identityRuleGroup) {
        this.identityRuleGroup = identityRuleGroup == null ? null : identityRuleGroup.trim();
    }

    public String getReportCycle() {
        return reportCycle;
    }

    public void setReportCycle(String reportCycle) {
        this.reportCycle = reportCycle == null ? null : reportCycle.trim();
    }

    public String getTaxEntType() {
        return taxEntType;
    }

    public void setTaxEntType(String taxEntType) {
        this.taxEntType = taxEntType == null ? null : taxEntType.trim();
    }

    public String getReportOrgId() {
        return reportOrgId;
    }

    public void setReportOrgId(String reportOrgId) {
        this.reportOrgId = reportOrgId == null ? null : reportOrgId.trim();
    }

    public BigDecimal getStateRate() {
        return stateRate;
    }

    public void setStateRate(BigDecimal stateRate) {
        this.stateRate = stateRate;
    }

    public String getTaxMod() {
        return taxMod;
    }

    public void setTaxMod(String taxMod) {
        this.taxMod = taxMod == null ? null : taxMod.trim();
    }

    public BigDecimal getVocCAmt() {
        return vocCAmt;
    }

    public void setVocCAmt(BigDecimal vocCAmt) {
        this.vocCAmt = vocCAmt;
    }

    public BigDecimal getVocMaxCAmt() {
        return vocMaxCAmt;
    }

    public void setVocMaxCAmt(BigDecimal vocMaxCAmt) {
        this.vocMaxCAmt = vocMaxCAmt;
    }

    public BigDecimal getVocMaxSAmt() {
        return vocMaxSAmt;
    }

    public void setVocMaxSAmt(BigDecimal vocMaxSAmt) {
        this.vocMaxSAmt = vocMaxSAmt;
    }

    public BigDecimal getVocSAmt() {
        return vocSAmt;
    }

    public void setVocSAmt(BigDecimal vocSAmt) {
        this.vocSAmt = vocSAmt;
    }

    public String getApvUser() {
        return apvUser;
    }

    public void setApvUser(String apvUser) {
        this.apvUser = apvUser == null ? null : apvUser.trim();
    }

    public String getBusiAddr() {
        return busiAddr;
    }

    public void setBusiAddr(String busiAddr) {
        this.busiAddr = busiAddr == null ? null : busiAddr.trim();
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType == null ? null : industryType.trim();
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType == null ? null : regType.trim();
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
        case ORG_NAME: {
            return getOrgName();
        }
        case TAX_NO: {
            return getTaxNo();
        }
        case ADDR: {
            return getAddr();
        }
        case TEL: {
            return getTel();
        }
        case BANK_NO: {
            return getBankNo();
        }
        case ACT_NO: {
            return getActNo();
        }
        case PAYEE_NAME: {
            return getPayeeName();
        }
        case VOC_MAX_AMT: {
            return (value = getVocMaxAmt()) == null ? null : value.toString();
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
        case VOC_AMT: {
            return (value = getVocAmt()) == null ? null : value.toString();
        }
        case EXCHANGE_TYPE: {
            return getExchangeType();
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
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
        }
        case VOC_NUM: {
            return getVocNum();
        }
        case TAX_KEY_SN: {
            return getTaxKeySn();
        }
        case BANK_NAME: {
            return getBankName();
        }
        case MACHINE_NO: {
            return getMachineNo();
        }
        case VOC_MAX_S_NUM: {
            return (value = getVocMaxSNum()) == null ? null : value.toString();
        }
        case VOC_MAX_C_NUM: {
            return (value = getVocMaxCNum()) == null ? null : value.toString();
        }
        case IDENTITY_RULE_GROUP: {
            return getIdentityRuleGroup();
        }
        case REPORT_CYCLE: {
            return getReportCycle();
        }
        case TAX_ENT_TYPE: {
            return getTaxEntType();
        }
        case REPORT_ORG_ID: {
            return getReportOrgId();
        }
        case STATE_RATE: {
            return (value = getStateRate()) == null ? null : value.toString();
        }
        case TAX_MOD: {
            return getTaxMod();
        }
        case VOC_C_AMT: {
            return (value = getVocCAmt()) == null ? null : value.toString();
        }
        case VOC_MAX_C_AMT: {
            return (value = getVocMaxCAmt()) == null ? null : value.toString();
        }
        case VOC_MAX_S_AMT: {
            return (value = getVocMaxSAmt()) == null ? null : value.toString();
        }
        case VOC_S_AMT: {
            return (value = getVocSAmt()) == null ? null : value.toString();
        }
        case APV_USER: {
            return getApvUser();
        }
        case BUSI_ADDR: {
            return getBusiAddr();
        }
        case CORP_NAME: {
            return getCorpName();
        }
        case INDUSTRY_TYPE: {
            return getIndustryType();
        }
        case REG_TYPE: {
            return getRegType();
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

    public HisVatTaxEntity set(Column column, String value) {
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
        case ORG_NAME: {
            setOrgName(value);
            break;
        }
        case TAX_NO: {
            setTaxNo(value);
            break;
        }
        case ADDR: {
            setAddr(value);
            break;
        }
        case TEL: {
            setTel(value);
            break;
        }
        case BANK_NO: {
            setBankNo(value);
            break;
        }
        case ACT_NO: {
            setActNo(value);
            break;
        }
        case PAYEE_NAME: {
            setPayeeName(value);
            break;
        }
        case VOC_MAX_AMT: {
            value = StringUtils.stripToNull(value);
            setVocMaxAmt(value == null ? null : new BigDecimal(value));
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
        case VOC_AMT: {
            value = StringUtils.stripToNull(value);
            setVocAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case EXCHANGE_TYPE: {
            setExchangeType(value);
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
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        case VOC_NUM: {
            setVocNum(value);
            break;
        }
        case TAX_KEY_SN: {
            setTaxKeySn(value);
            break;
        }
        case BANK_NAME: {
            setBankName(value);
            break;
        }
        case MACHINE_NO: {
            setMachineNo(value);
            break;
        }
        case VOC_MAX_S_NUM: {
            value = StringUtils.stripToNull(value);
            setVocMaxSNum(value == null ? null : new BigDecimal(value));
            break;
        }
        case VOC_MAX_C_NUM: {
            value = StringUtils.stripToNull(value);
            setVocMaxCNum(value == null ? null : new BigDecimal(value));
            break;
        }
        case IDENTITY_RULE_GROUP: {
            setIdentityRuleGroup(value);
            break;
        }
        case REPORT_CYCLE: {
            setReportCycle(value);
            break;
        }
        case TAX_ENT_TYPE: {
            setTaxEntType(value);
            break;
        }
        case REPORT_ORG_ID: {
            setReportOrgId(value);
            break;
        }
        case STATE_RATE: {
            value = StringUtils.stripToNull(value);
            setStateRate(value == null ? null : new BigDecimal(value));
            break;
        }
        case TAX_MOD: {
            setTaxMod(value);
            break;
        }
        case VOC_C_AMT: {
            value = StringUtils.stripToNull(value);
            setVocCAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case VOC_MAX_C_AMT: {
            value = StringUtils.stripToNull(value);
            setVocMaxCAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case VOC_MAX_S_AMT: {
            value = StringUtils.stripToNull(value);
            setVocMaxSAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case VOC_S_AMT: {
            value = StringUtils.stripToNull(value);
            setVocSAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case APV_USER: {
            setApvUser(value);
            break;
        }
        case BUSI_ADDR: {
            setBusiAddr(value);
            break;
        }
        case CORP_NAME: {
            setCorpName(value);
            break;
        }
        case INDUSTRY_TYPE: {
            setIndustryType(value);
            break;
        }
        case REG_TYPE: {
            setRegType(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public HisVatTaxEntity set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public HisVatTaxEntity set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public HisVatTaxEntity set(AbstractTable table) {
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
        } else if (!(obj instanceof HisVatTaxEntity)) {
            return false;
        }
        HisVatTaxEntity rhs = (HisVatTaxEntity) obj;
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
        if (getOrgName() != null) {
            builder.append("orgName", getOrgName());
        }
        if (getTaxNo() != null) {
            builder.append("taxNo", getTaxNo());
        }
        if (getAddr() != null) {
            builder.append("addr", getAddr());
        }
        if (getTel() != null) {
            builder.append("tel", getTel());
        }
        if (getBankNo() != null) {
            builder.append("bankNo", getBankNo());
        }
        if (getActNo() != null) {
            builder.append("actNo", getActNo());
        }
        if (getPayeeName() != null) {
            builder.append("payeeName", getPayeeName());
        }
        if (getVocMaxAmt() != null) {
            builder.append("vocMaxAmt", getVocMaxAmt());
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
        if (getVocAmt() != null) {
            builder.append("vocAmt", getVocAmt());
        }
        if (getExchangeType() != null) {
            builder.append("exchangeType", getExchangeType());
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
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        if (getVocNum() != null) {
            builder.append("vocNum", getVocNum());
        }
        if (getTaxKeySn() != null) {
            builder.append("taxKeySn", getTaxKeySn());
        }
        if (getBankName() != null) {
            builder.append("bankName", getBankName());
        }
        if (getMachineNo() != null) {
            builder.append("machineNo", getMachineNo());
        }
        if (getVocMaxSNum() != null) {
            builder.append("vocMaxSNum", getVocMaxSNum());
        }
        if (getVocMaxCNum() != null) {
            builder.append("vocMaxCNum", getVocMaxCNum());
        }
        if (getIdentityRuleGroup() != null) {
            builder.append("identityRuleGroup", getIdentityRuleGroup());
        }
        if (getReportCycle() != null) {
            builder.append("reportCycle", getReportCycle());
        }
        if (getTaxEntType() != null) {
            builder.append("taxEntType", getTaxEntType());
        }
        if (getReportOrgId() != null) {
            builder.append("reportOrgId", getReportOrgId());
        }
        if (getStateRate() != null) {
            builder.append("stateRate", getStateRate());
        }
        if (getTaxMod() != null) {
            builder.append("taxMod", getTaxMod());
        }
        if (getVocCAmt() != null) {
            builder.append("vocCAmt", getVocCAmt());
        }
        if (getVocMaxCAmt() != null) {
            builder.append("vocMaxCAmt", getVocMaxCAmt());
        }
        if (getVocMaxSAmt() != null) {
            builder.append("vocMaxSAmt", getVocMaxSAmt());
        }
        if (getVocSAmt() != null) {
            builder.append("vocSAmt", getVocSAmt());
        }
        if (getApvUser() != null) {
            builder.append("apvUser", getApvUser());
        }
        if (getBusiAddr() != null) {
            builder.append("busiAddr", getBusiAddr());
        }
        if (getCorpName() != null) {
            builder.append("corpName", getCorpName());
        }
        if (getIndustryType() != null) {
            builder.append("industryType", getIndustryType());
        }
        if (getRegType() != null) {
            builder.append("regType", getRegType());
        }
        return builder.toString();
    }

    public HisVatTaxEntity() {
        /* pass */
    }

    public HisVatTaxEntity(Map<String, ?> map) {
        set(map);
    }

    public HisVatTaxEntity(AbstractTable table) {
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
        ORG_NAME,
        TAX_NO,
        ADDR,
        TEL,
        BANK_NO,
        ACT_NO,
        PAYEE_NAME,
        VOC_MAX_AMT,
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
        VOC_AMT,
        EXCHANGE_TYPE,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        CHECK_ERR_TYPE,
        VOC_NUM,
        TAX_KEY_SN,
        BANK_NAME,
        MACHINE_NO,
        VOC_MAX_S_NUM,
        VOC_MAX_C_NUM,
        IDENTITY_RULE_GROUP,
        REPORT_CYCLE,
        TAX_ENT_TYPE,
        REPORT_ORG_ID,
        STATE_RATE,
        TAX_MOD,
        VOC_C_AMT,
        VOC_MAX_C_AMT,
        VOC_MAX_S_AMT,
        VOC_S_AMT,
        APV_USER,
        BUSI_ADDR,
        CORP_NAME,
        INDUSTRY_TYPE,
        REG_TYPE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
