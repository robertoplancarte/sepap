class CreateAttempts < ActiveRecord::Migration
  def self.up
    create_table :attempts do |t|

      t.timestamps
    end
  end

  def self.down
    drop_table :attempts
  end
end