package org.hashes.hashtopussy.agent.api.response;

public enum ChunkResponse {
  ACTION {
    @Override
    public String identifier() {
      return "action";
    }
  },
  RESPONSE {
    @Override
    public String identifier() {
      return "response";
    }
  },
  CHUNK {
    @Override
    public String identifier() {
      return "chunk";
    }
  },
  SKIP {
    @Override
    public String identifier() {
      return "skip";
    }
  },
  LENGTH {
    @Override
    public String identifier() {
      return "length";
    }
  };
  
  public abstract String identifier();
}
