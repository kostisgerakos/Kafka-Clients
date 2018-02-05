/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.rawfie.uxv.commands;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Header extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -91882281676537469L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Header\",\"namespace\":\"eu.rawfie.uxv.commands\",\"fields\":[{\"name\":\"sourceSystem\",\"type\":\"string\",\"doc\":\"Canonical name of the originating system\"},{\"name\":\"sourceModule\",\"type\":\"string\",\"doc\":\"Canonical name of the module within a given system that originated the message\"},{\"name\":\"time\",\"type\":\"long\",\"doc\":\"Time elapsed since the Unix epoch\",\"unit\":\"ms\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Canonical name of the originating system */
   private java.lang.CharSequence sourceSystem;
  /** Canonical name of the module within a given system that originated the message */
   private java.lang.CharSequence sourceModule;
  /** Time elapsed since the Unix epoch */
   private long time;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Header() {}

  /**
   * All-args constructor.
   * @param sourceSystem Canonical name of the originating system
   * @param sourceModule Canonical name of the module within a given system that originated the message
   * @param time Time elapsed since the Unix epoch
   */
  public Header(java.lang.CharSequence sourceSystem, java.lang.CharSequence sourceModule, java.lang.Long time) {
    this.sourceSystem = sourceSystem;
    this.sourceModule = sourceModule;
    this.time = time;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sourceSystem;
    case 1: return sourceModule;
    case 2: return time;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sourceSystem = (java.lang.CharSequence)value$; break;
    case 1: sourceModule = (java.lang.CharSequence)value$; break;
    case 2: time = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'sourceSystem' field.
   * @return Canonical name of the originating system
   */
  public java.lang.CharSequence getSourceSystem() {
    return sourceSystem;
  }

  /**
   * Sets the value of the 'sourceSystem' field.
   * Canonical name of the originating system
   * @param value the value to set.
   */
  public void setSourceSystem(java.lang.CharSequence value) {
    this.sourceSystem = value;
  }

  /**
   * Gets the value of the 'sourceModule' field.
   * @return Canonical name of the module within a given system that originated the message
   */
  public java.lang.CharSequence getSourceModule() {
    return sourceModule;
  }

  /**
   * Sets the value of the 'sourceModule' field.
   * Canonical name of the module within a given system that originated the message
   * @param value the value to set.
   */
  public void setSourceModule(java.lang.CharSequence value) {
    this.sourceModule = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return Time elapsed since the Unix epoch
   */
  public java.lang.Long getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * Time elapsed since the Unix epoch
   * @param value the value to set.
   */
  public void setTime(java.lang.Long value) {
    this.time = value;
  }

  /**
   * Creates a new Header RecordBuilder.
   * @return A new Header RecordBuilder
   */
  public static eu.rawfie.uxv.commands.Header.Builder newBuilder() {
    return new eu.rawfie.uxv.commands.Header.Builder();
  }

  /**
   * Creates a new Header RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Header RecordBuilder
   */
  public static eu.rawfie.uxv.commands.Header.Builder newBuilder(eu.rawfie.uxv.commands.Header.Builder other) {
    return new eu.rawfie.uxv.commands.Header.Builder(other);
  }

  /**
   * Creates a new Header RecordBuilder by copying an existing Header instance.
   * @param other The existing instance to copy.
   * @return A new Header RecordBuilder
   */
  public static eu.rawfie.uxv.commands.Header.Builder newBuilder(eu.rawfie.uxv.commands.Header other) {
    return new eu.rawfie.uxv.commands.Header.Builder(other);
  }

  /**
   * RecordBuilder for Header instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Header>
    implements org.apache.avro.data.RecordBuilder<Header> {

    /** Canonical name of the originating system */
    private java.lang.CharSequence sourceSystem;
    /** Canonical name of the module within a given system that originated the message */
    private java.lang.CharSequence sourceModule;
    /** Time elapsed since the Unix epoch */
    private long time;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.rawfie.uxv.commands.Header.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sourceSystem)) {
        this.sourceSystem = data().deepCopy(fields()[0].schema(), other.sourceSystem);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sourceModule)) {
        this.sourceModule = data().deepCopy(fields()[1].schema(), other.sourceModule);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.time)) {
        this.time = data().deepCopy(fields()[2].schema(), other.time);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Header instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.rawfie.uxv.commands.Header other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.sourceSystem)) {
        this.sourceSystem = data().deepCopy(fields()[0].schema(), other.sourceSystem);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sourceModule)) {
        this.sourceModule = data().deepCopy(fields()[1].schema(), other.sourceModule);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.time)) {
        this.time = data().deepCopy(fields()[2].schema(), other.time);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'sourceSystem' field.
      * Canonical name of the originating system
      * @return The value.
      */
    public java.lang.CharSequence getSourceSystem() {
      return sourceSystem;
    }

    /**
      * Sets the value of the 'sourceSystem' field.
      * Canonical name of the originating system
      * @param value The value of 'sourceSystem'.
      * @return This builder.
      */
    public eu.rawfie.uxv.commands.Header.Builder setSourceSystem(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.sourceSystem = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sourceSystem' field has been set.
      * Canonical name of the originating system
      * @return True if the 'sourceSystem' field has been set, false otherwise.
      */
    public boolean hasSourceSystem() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sourceSystem' field.
      * Canonical name of the originating system
      * @return This builder.
      */
    public eu.rawfie.uxv.commands.Header.Builder clearSourceSystem() {
      sourceSystem = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sourceModule' field.
      * Canonical name of the module within a given system that originated the message
      * @return The value.
      */
    public java.lang.CharSequence getSourceModule() {
      return sourceModule;
    }

    /**
      * Sets the value of the 'sourceModule' field.
      * Canonical name of the module within a given system that originated the message
      * @param value The value of 'sourceModule'.
      * @return This builder.
      */
    public eu.rawfie.uxv.commands.Header.Builder setSourceModule(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.sourceModule = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sourceModule' field has been set.
      * Canonical name of the module within a given system that originated the message
      * @return True if the 'sourceModule' field has been set, false otherwise.
      */
    public boolean hasSourceModule() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sourceModule' field.
      * Canonical name of the module within a given system that originated the message
      * @return This builder.
      */
    public eu.rawfie.uxv.commands.Header.Builder clearSourceModule() {
      sourceModule = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * Time elapsed since the Unix epoch
      * @return The value.
      */
    public java.lang.Long getTime() {
      return time;
    }

    /**
      * Sets the value of the 'time' field.
      * Time elapsed since the Unix epoch
      * @param value The value of 'time'.
      * @return This builder.
      */
    public eu.rawfie.uxv.commands.Header.Builder setTime(long value) {
      validate(fields()[2], value);
      this.time = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * Time elapsed since the Unix epoch
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'time' field.
      * Time elapsed since the Unix epoch
      * @return This builder.
      */
    public eu.rawfie.uxv.commands.Header.Builder clearTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Header build() {
      try {
        Header record = new Header();
        record.sourceSystem = fieldSetFlags()[0] ? this.sourceSystem : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.sourceModule = fieldSetFlags()[1] ? this.sourceModule : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.time = fieldSetFlags()[2] ? this.time : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
