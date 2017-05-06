package org.boot.services.metadata;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MetadataView {

    private Metadata metadata;

    public MetadataView(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getId() {
        return metadata.getId().toString();
    }

    public String getGroup() {
        return metadata.getGroup();
    }

    public String getName() {
        return metadata.getName();
    }

    public Object getValue() {
        return metadata.getValue();
    }

    public LocalDateTime getLastUpdatedTs() {
        return metadata.getLastUpdatedTs();
    }


}
