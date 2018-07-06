

-------------------------------------------------------------------------------
--  plm requirement
-------------------------------------------------------------------------------
CREATE TABLE PLM_REQUIREMENT(
        ID BIGINT NOT NULL,
	NAME VARCHAR(200),
	PRIORITY INT,
	TAG VARCHAR(200),
	STATUS VARCHAR(50),
	CREATE_TIME DATETIME,
	USER_ID VARCHAR(64),
	PARENT_ID BIGINT,
	ISSUE_ID BIGINT,
	VERSION_ID BIGINT,
	PROJECT_ID BIGINT,
	CONSTRAINT PK_PLM_REQUIREMENT PRIMARY KEY(ID),
        CONSTRAINT FK_PIM_REQUIREMENT_PARENT FOREIGN KEY(PARENT_ID) REFERENCES PLM_REQUIREMENT(ID),
        CONSTRAINT FK_PIM_REQUIREMENT_ISSUE FOREIGN KEY(ISSUE_ID) REFERENCES PLM_ISSUE(ID),
        CONSTRAINT FK_PIM_REQUIREMENT_VERSION FOREIGN KEY(VERSION_ID) REFERENCES PLM_VERSION(ID),
        CONSTRAINT FK_PIM_REQUIREMENT_PROJECT FOREIGN KEY(PROJECT_ID) REFERENCES PLM_PROJECT(ID)
);
