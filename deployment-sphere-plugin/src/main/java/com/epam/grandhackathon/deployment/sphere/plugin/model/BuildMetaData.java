package com.epam.grandhackathon.deployment.sphere.plugin.model;

import lombok.Data;

@Data
public class BuildMetaData extends ApplicationMetaData{
    private String buildVersion;
}