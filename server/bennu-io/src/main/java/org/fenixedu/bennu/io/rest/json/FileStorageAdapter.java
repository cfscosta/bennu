package org.fenixedu.bennu.io.rest.json;

import org.fenixedu.bennu.core.annotation.DefaultJsonAdapter;
import org.fenixedu.bennu.core.json.JsonAdapter;
import org.fenixedu.bennu.core.json.JsonBuilder;
import org.fenixedu.bennu.io.domain.FileStorage;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@DefaultJsonAdapter(FileStorage.class)
public class FileStorageAdapter implements JsonAdapter<FileStorage> {

    @Override
    public FileStorage create(JsonElement arg0, JsonBuilder arg1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public FileStorage update(JsonElement arg0, FileStorage arg1, JsonBuilder arg2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonElement view(FileStorage fs, JsonBuilder arg1) {
        final JsonObject json = new JsonObject();
        json.addProperty("id", fs.getExternalId());
        json.addProperty("name", fs.getName());
        json.addProperty("type", fs.getClass().getSimpleName());
        json.addProperty("default", fs.isDefault());
        json.addProperty("filesCount", fs.getFileSet().size());
        return json;
    }
}
